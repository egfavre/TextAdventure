package com.Favre;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//pull in a library

public class Main {
    static final String SAVE_FILE = "game.json";
    static Scanner scanner = new Scanner(System.in);
    static Player player;


    public static void main(String[] args) throws Exception {
        player = loadGame();
        if (player == null) {
            player = new Player();
            System.out.println("Starting new game.");
        }
        else {
            System.out.println("Found saved file.");
            System.out.println("Start new game instead? [y/n");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y"))
            {player = new Player();
        }

        System.out.println("Welcome traveller!");


        if (player.name == null) {
            player.chooseName();
        }
        if (player.weapon == null) {
            player.chooseWeapon();
        }
        if (player.location == null) {
            player.chooseLocation();
        }

        if (player.items.isEmpty()) {
            player.fintItem("armor");
            player.fintItem("potion");
        }

        Enemy ogre = new Enemy("Ogre", 10, 10);
        player.battle(ogre);

        saveGame();


    }

    public static String nextLine(){
        String line = scanner.nextLine();
        while (line.startsWith("/")){
            if (line.equals("/inv")){
                for (String item : player.items){
                    System.out.println(item);
                }
            }
            else if (line.equals("/save")){
                saveGame();
            }
            else{
                System.out.println("Command not found.");
            }

            line = scanner.nextLine();

        }
        return line;
    }

    public static void saveGame() {
        JsonSerializer serializer = new JsonSerializer();
        //String json = serializer.serialize(player);
        String json = serializer.include("*").serialize(player);

        File f = new File(SAVE_FILE);
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Player loadGame() {
        File f = new File(SAVE_FILE);
        try {
            Scanner scanner = new Scanner(f);
            scanner.useDelimiter("\\Z");
            String contents = scanner.next();
            JsonParser parser = new JsonParser();
            return parser.parse(contents, Player.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;


    }

//        System.out.println("type a number...");
//        String num = scanner.nextLine();
//        int numInt = Integer.valueOf(num);
//
//        if (numInt < 0) {
//            System.out.println("That's a negative number.");
//        } else {
//            System.out.println("That's a positive number.");
//        }


}
