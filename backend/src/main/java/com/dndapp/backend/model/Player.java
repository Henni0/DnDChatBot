package com.dndapp.backend.model;

public class Player {
  // Character Data
  private String name;
  private String characterClass;
  private String race;
  private String background;
  private String alignment;
  // Attributes
  private int strength;
  private int dexterity;
  private int constitution;
  private int intelligence;
  private int wisdom;
  private int charisma;
  // derived Stats
  private int hitPoints;
  private int armorClass;
  private int initiative;
  private int movementSpeed;
  private int savingThrows;
  // Skills
  private int acrobatics;
  private int animalHandling;
  private int perception;
  private int stealth;
  private int persuasion;
  private int proficiencyBonus;
  // Gear
  private String[] equipment;
}
