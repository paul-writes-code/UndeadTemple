package com.example.TextAdventure.Map;

import java.util.ArrayList;

public class Level {

    private String areaName;
    private int levelNumber;

    private ArrayList<Room> rooms;
    private Room startRoom; // the beginning of this room, used to chain levels together
    private Room endRoom; // the end of this room, used to chain levels together
    private ArrayList<Room> areaExitRooms; // these are exits to other areas outside of the chain of levels; set by Area

    private Level(String areaName, int levelNumber, ArrayList<Room> rooms, Room startRoom, Room endRoom, ArrayList<Room> areaExitRooms) {
        this.areaName = areaName;
        this.levelNumber = levelNumber;

        this.rooms = rooms;
        this.startRoom = startRoom;
        this.endRoom = endRoom;
        this.areaExitRooms = areaExitRooms;
    }

    public ArrayList<Room> getRooms() { return rooms; }
    public Room getStartRoom() { return startRoom; }
    public Room getEndRoom() { return endRoom; }
    public ArrayList<Room> getAreaExitRooms() { return areaExitRooms; }

    public static void connectLevels(Level firstLevel, Level secondLevel) {
        firstLevel.endRoom.connectToRoom(secondLevel.startRoom);
        secondLevel.startRoom.connectToRoom(firstLevel.endRoom);
    }

    public static Level generateLevel(String areaName, int levelNumber, String levelString) {

        // Split up each room's information line, which are separated by apostrophes.
        String[] roomLines = levelString.split("'");

        ArrayList<Room> rooms = new ArrayList<>();
        Room startRoom = null;
        Room endRoom = null;
        ArrayList<Room> exitRooms = new ArrayList<>();

        // Create each room
        for (int i = 0; i < roomLines.length; i++) {

            // Split up the roomId from the room adjacency list, which are separated by a semi-colon.
            String[] roomInfo = roomLines[i].split(";");

            String roomId = roomInfo[0];
            String[] adjacentRoomsString = roomInfo[1].split(","); // Split adjacency information.

            // roomId is either "xy" or "axy".
            int x =  Character.getNumericValue(roomId.charAt(roomId.length() - 2));
            int y =  Character.getNumericValue(roomId.charAt(roomId.length() - 1));

            Room room = new Room(areaName, levelNumber, x, y, adjacentRoomsString);
            rooms.add(room);

            // Search for markers
            switch (roomId.charAt(0)) {
                case '[': // startRoom
                    startRoom = room;
                    break;
                case ']': // endRoom
                    endRoom = room;
                    break;
                case '#': // areaExitRoom
                    exitRooms.add(room);
                    break;
                case 'x': // spawnRoom
                    WorldMap.setSpawnRoom(room);
                    break;
            }
        }

        Level level = new Level(areaName, levelNumber, rooms, startRoom, endRoom, exitRooms);

        // Once every room has been created, they can be connected
        for (Room room : rooms)
            room.finalizeAdjacentRooms(level);

        return level;
    }
}
