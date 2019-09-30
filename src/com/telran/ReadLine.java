package com.telran;

import java.util.Scanner;

/**
 * Created by eltern on 26.09.2019.
 */
public class ReadLine {
    public static void ReadAndPrintString() {
        System.out.println("Gib einen Text ein: ");

        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        System.out.println("Du hast eingegeben: \"" + text + "\"");
    }
}
