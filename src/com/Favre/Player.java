package com.Favre;

import java.util.ArrayList;

/**
 * Created by user on 5/18/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    public void chooseName() {
        System.out.println("What is your name?");

        name = Main.scanner.nextLine();
        System.out.println("Welcome, " + name);

    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        weapon = Main.scanner.nextLine();

        if(weapon.equalsIgnoreCase("sword")){
            System.out.println("sword is a fine choice.");
        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Mace is a fine choice.");
        } else {
            throw new Exception("Invalid weapon");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your location [forest/tunnel]");
        location = Main.scanner.nextLine();

        if (location.equalsIgnoreCase("forest")){
            System.out.println("Entering Forest...");
        }
        else if (location.equalsIgnoreCase("tunnel")){
            System.out.println("Entering tunnel...");
        }
        else{
            throw new Exception("Invalid location");
        }

    }

    public void fintItem(String item) {
        System.out.println("You found " + item + "! Pick it up? [Y/N]");
        String answer = Main.scanner.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            items.add(item);
            System.out.println("You now have " + items.size() + " items");
        }
    }
}
