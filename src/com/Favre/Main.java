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

    }
}