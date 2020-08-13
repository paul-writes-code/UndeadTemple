package com.example.TextAdventure.Common;

import com.example.TextAdventure.UserInterface.Input;

public class Strings {

    private static final String INDENTATION = "  ";

    // World
    public static final String WORLD_WELCOME = "Welcome to %s.";
    public static final String WORLD_UNKNOWN_LOCATION = "Unknown location: %s.";
    public static final String UNKNOWN_ENTITY = "Unknown entity: %s.";

    public static final String NECROMANCER_NAME = "necromancer";
    public static final String SKELETON_NAME = "skeleton";
    public static final String BANDIT_NAME = "bandit";
    public static final String LIZARD_NAME = "lizard";
    public static final String DARK_ELF_NAME = "dark elf";
    public static final String UNDEAD_NAME = "undead";

    // Combat
    public static final String COMBAT_PLAYER_ATTACK_ENEMY = "You attack %s, dealing %d damage. %s has %d/%d health.";
    public static final String COMBAT_ENEMY_ATTACK_PLAYER = "%s attacks you, dealing %d damage. You have %d/%d health.";
    public static final String COMBAT_PLAYER_HEALTH_POTION = "You drink a health potion.";
    public static final String COMBAT_PLAYER_DEFEATED = "You have been defeated.";

    public static final String COMBAT_PLAYER_VICTORY_XP = "You defeat %s and gain %d experience.";
    public static final String COMBAT_PLAYER_VICTORY_NO_XP = "You defeat %s.";
    public static final String COMBAT_PLAYER_VICTORY_NECROMANCER = "You have defeated the necromancer and completed the game.";
    public static final String COMBAT_LEVEL_UP = "\nLevel up! Enter 'character' to view character details.";
    public static final String COMBAT_FIND_HEALTH_POTION = "You find a health potion.";

    public static final String COMBAT_ATTACK_ENEMY = "Enter 'attack enemy' to select an enemy to attack.";
    public static final String COMBAT_INSUFFICIENT_HEALTH_POTIONS = "You do not have any health potions.";

    // View Location
    public static final String DISPLAY_HEALTH = "health: %d/%d";
    public static final String DISPLAY_LEVEL = "level: %s level %d";
    public static final String DISPLAY_COMMANDS = "commands: ";
    public static final String COMMAND_HEAL_DISPLAY = INDENTATION + Input.COMMAND_HEAL + ": drink a health potion (%d)";
    public static final String LOCATION_DISPLAY_OBJECT_GO = INDENTATION + Input.COMMAND_GO + " %s";
    public static final String LOCATION_DISPLAY_OBJECT_ATTACK = INDENTATION + Input.COMMAND_ATTACK + " %s: %d/%d health";

    // View Character
    public static final String CHARACTER_DISPLAY_HEALTH =  "health: %d/%d";
    public static final String CHARACTER_DISPLAY_DAMAGE =  "damage: %d";
    public static final String CHARACTER_DISPLAY_EXPERIENCE =  "experience: %d/%d";
    public static final String CHARACTER_DISPLAY_EXPERIENCE_MAX_LEVEL =  "experience: %d";
    public static final String CHARACTER_DISPLAY_HEALTH_POTIONS =  "health potions: %d";

    // Input / Actions
    public static final String INPUT_COMMAND = "Enter command: ";
    public static final String INPUT_COMMAND_ARGUMENT_LOCATION = "Enter '%s location' to perform that action.";
    public static final String INPUT_COMMAND_UNKNOWN = "Unknown command: '%s'.";
    public static final String INPUT_ACTION_PROMPT = "Enter '%s' to %s: ";
    public static final String INPUT_ACTION_GO = "move to %s";
    public static final String INPUT_ACTION_EXAMINE = "view your current location";
    public static final String INPUT_ACTION_ATTACK = "attack %s";
    public static final String INPUT_ACTION_HEAL = "drink a health potion";
    public static final String INPUT_ACTION_CHARACTER = "view your character details";
}
