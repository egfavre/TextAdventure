package com.Favre;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome traveller!");

        Player player = new Player();

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();

        player.fintItem("armor");
        player.fintItem("potion");


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
