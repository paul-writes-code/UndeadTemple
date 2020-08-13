package com.example.TextAdventure.Map;

import com.example.TextAdventure.Character.Enemy;

import java.util.ArrayList;

public class WorldMap {
    private static boolean locationsInitialized = false;

    private static ArrayList<Area> areas;

    private static Room spawnRoom = null;

    public static Room getSpawnRoom() {
        initMap();
        return spawnRoom;
    }
    public static void setSpawnRoom(Room room) {
        spawnRoom = room;
    }

    private static Area generateDarkForest() {

        ArrayList<String> levelStrings = new ArrayList<>();

        levelStrings.add(
                "#11;12'"+
                "12;11,13'" +
                "13;12,23'" +
                "23;13,22'" +
                "22;23,32'" +
                "]32;22");

        levelStrings.add(
                "[01;02'" +
                "02;01,12'" +
                "12;02,22'" +
                "22;12,32'" +
                "]32;22");

        levelStrings.add(
                "[02;12'" +
                "12;02,11'" +
                "11;12,21'" +
                "21;11,20,22'" +
                "22;21,23'" +
                "#23;22'" +
                "20;21,30'" +
                "]30;20");

        levelStrings.add(
                "[03;13'" +
                "13;03,23'" +
                "]23;13");

        return Area.generateArea("dark forest", levelStrings, Enemy.EnemyType.BANDIT);
    }
    private static Area generateMountain() {

        ArrayList<String> levelStrings = new ArrayList<>();

        levelStrings.add(
                "[32;22'" +
                "22;32,21'" +
                "21;22,20'" +
                "20;21,30'" +
                "]30;20");

        levelStrings.add(
                "[00;10'" +
                "#10;00,11'" +
                "11;10,12'" +
                "12;11,13'" +
                "13;12,23'" +
                "23;13,22'" +
                "22;21,23,32'" +
                "21;20,22'" +
                "20;21,30'" +
                "30;20'" +
                "32;22,33'" +
                "]33;32");

        levelStrings.add(
                "[00;01'" +
                "01;00,11'" +
                "11;01,21'" +
                "21;11,20,22'" +
                "20;21'" +
                "22;21,12'" +
                "12;22,13'" +
                "]13;12");

        return Area.generateArea("mountain", levelStrings, Enemy.EnemyType.LIZARD);
    }
    private static Area generateEnchantedSwamp() {

        ArrayList<String> levelStrings = new ArrayList<>();

        levelStrings.add(
                "[21;11'" +
                "11;01,21,12'" +
                "01;11,02'" +
                "02;01'" +
                "12;11,22'" +
                "22;12,32'" +
                "32;22,31'" +
                "]31;32");

        levelStrings.add(
                "[02;12'" +
                "12;02,22,11'" +
                "#22;12'" +
                "11;12,10'" +
                "10;11,20'" +
                "20;10,30'" +
                "]30;20");

        levelStrings.add(
                "[01;02'" +
                "02;01,12'" +
                "12;02,22'" +
                "22;12,21'" +
                "21;22,20,31'" +
                "20;21,10'" +
                "10;20'" +
                "31;21,30'" +
                "]30;31");

        return Area.generateArea("enchanted swamp", levelStrings, Enemy.EnemyType.DARKELF);
    }
    private static Area generateUndeadTemple() {

        ArrayList<String> levelStrings = new ArrayList<>();

        levelStrings.add(
                "[12;13'" +
                        "13;03,12,23'" +
                        "03;13,02'" +
                        "02;03'" +
                        "23;13,22'" +
                        "22;23,21'" +
                        "21;22,20,31'" +
                        "20;21,10'" +
                        "10;00,20'" +
                        "00;10'" +
                        "31;21,32'" +
                        "32;31,33'" +
                        "]33;32");

        levelStrings.add(
                "[33;23'" +
                        "23;13,33,22'" +
                        "13;23,03'" +
                        "03;13'" +
                        "22;23,21'" +
                        "21;11,22,31'" +
                        "31;21,30'" +
                        "30;20,31'" +
                        "]20;10,30'" +
                        "10;00,11,20'" +
                        "11;10,21'" +
                        "00;10,01'" +
                        "01;00,02'" +
                        "02;01,12'" +
                        "12;02");

        levelStrings.add(
                "[20;30'" +
                        "30;20,31'" +
                        "31;30,32'" +
                        "32;31,33'" +
                        "33;32,23'" +
                        "23;22,33'" +
                        "22;12,21,23'" +
                        "21;11,22'" +
                        "11;01,10,21'" +
                        "10;11'" +
                        "01;11,02'" +
                        "]02;01,03'" +
                        "03;02,13'" +
                        "13;03,12'" +
                        "12;13,22");

        levelStrings.add(
                "[02;03,01,12'" +
                        "03;02,13'" +
                        "13;03,23'" +
                        "23;13,22'" +
                        "12;02,22'" +
                        "22;12,23,32'" +
                        "32;22'" +
                        "01;02,11'" +
                        "11;01,21'" +
                        "21;11,20,31'" +
                        "31;21'" +
                        "20;21,10'" +
                        "]10;20");

        levelStrings.add(
                "[10;11'" +
                        "11;10,21'" +
                        "21;11,22'" +
                        "22;21,23'" +
                        "]23;22");

        return Area.generateArea("undead temple", levelStrings, Enemy.EnemyType.UNDEAD);
    }

    private static Area generateCrypt() {

        ArrayList<String> levelStrings = new ArrayList<>();

        levelStrings.add(
                "[03;02'" +
                "02;01,03'" +
                "01;00,02'" +
                "00;10,01'" +
                "10;00,11'" +
                "]11;10");

        levelStrings.add(
                "[11;10'" +
                "10;11,20'" +
                "20;10,21'" +
                "21;20,22'" +
                "22;21,23'" +
                "]23;22");

        levelStrings.add(
                "[23;22,13'" +
                "22;23,12'" +
                "13;23,12'" +
                "12;13,22,11'" +
                "11;12,21'" +
                "x21;11");

        return Area.generateArea("crypt", levelStrings, Enemy.EnemyType.SKELETON);
    }
    private static Area generateBanditHideout() {

        ArrayList<String> levelStrings = new ArrayList<>();

        levelStrings.add(
                "[20;21'" +
                "21;20,31,22'" +
                "31;21,32'" +
                "32;22,31'" +
                "22;12,21,32'" +
                "12;22,13'" +
                "13;03,23,12'" +
                "]23;13'" +
                "03;13,02'" +
                "02;03,01'" +
                "01;02,00'" +
                "00;01");

        levelStrings.add(
                "[10;00,20,11'" +
                "00;01,10'" +
                "01;00'" +
                "11;10'" +
                "20;10,21'" +
                "21;20,22'" +
                "22;21,12'" +
                "12;22");

        return Area.generateArea("bandit hideout", levelStrings, Enemy.EnemyType.BANDIT);
    }
    private static Area generateLizardCave() {

        ArrayList<String> levelStrings = new ArrayList<>();

        levelStrings.add(
                "[02;12'" +
                "12;02,11,13'" +
                "11;12,21'" +
                "13;12,23'" +
                "23;13,22'" +
                "22;23,21'" +
                "21;11,22,20'" +
                "20;21,30'" +
                "]30;20");

        levelStrings.add(
                "[11;12'" +
                "12;11,13'" +
                "13;12,23'" +
                "23;13,33'" +
                "33;23,32'" +
                "32;33");

        return Area.generateArea("lizard cave", levelStrings, Enemy.EnemyType.LIZARD);
    }
    private static Area generateDarkElfCave() {
        ArrayList<String> levelStrings = new ArrayList<>();

        levelStrings.add(
                "[12;02,11,22'" +
                "02;12,01'" +
                "01;02,11'" +
                "11;01,12'" +
                "22;12,23,32'" +
                "23;22,33'" +
                "33;23'" +
                "32;22,31'" +
                "31;32,30'" +
                "30;31,20'" +
                "]20;30");

        levelStrings.add(
                "[13;12'" +
                "12;13,22'" +
                "22;12,21'" +
                "21;11,20,22,31'" +
                "31;21,30'" +
                "30;31'" +
                "11;21,10'" +
                "10;11,20'" +
                "20;10,21");

        return Area.generateArea("dark elf cave", levelStrings, Enemy.EnemyType.DARKELF);
    }

    private static void initMap() {
        if (locationsInitialized)
            return;

        areas = new ArrayList<>();

        // Generate the main map
        Area crypt = generateCrypt();
        Area darkForest = generateDarkForest();
        Area mountain = generateMountain();
        Area enchantedSwamp = generateEnchantedSwamp();
        Area undeadTemple = generateUndeadTemple();

        // Connect the main map
        Area.connectAreaToExitRoom(darkForest.getAreaExitRooms().get(0), crypt);
        Area.connectAreas(darkForest, mountain);
        Area.connectAreas(mountain, enchantedSwamp);
        Area.connectAreas(enchantedSwamp, undeadTemple);

        // Generate the side objectives
        Area banditHideout = generateBanditHideout();
        Area lizardCave = generateLizardCave();
        Area darkElfCave = generateDarkElfCave();

        // Connect the side objectives
        Area.connectAreaToExitRoom(darkForest.getAreaExitRooms().get(1), banditHideout);
        Area.connectAreaToExitRoom(mountain.getAreaExitRooms().get(0), lizardCave);
        Area.connectAreaToExitRoom(enchantedSwamp.getAreaExitRooms().get(0), darkElfCave);

        areas.add(crypt);
        areas.add(darkForest);
        areas.add(mountain);
        areas.add(enchantedSwamp);
        areas.add(undeadTemple);
        areas.add(banditHideout);
        areas.add(lizardCave);
        areas.add(darkElfCave);

        undeadTemple.getEndRoom().addEnemy(Enemy.createEnemy(Enemy.EnemyType.NECROMANCER));

        locationsInitialized = true;
    }
}
