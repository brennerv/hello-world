package com.telran;

import javax.swing.JOptionPane;

public class hello_world {

    public static final String MY_NAME = "Junior";

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!!!");
        if (args.length > 0) {
            System.out.println("My name is " + MY_NAME + " " + args[0]);
            JOptionPane.showMessageDialog(null, "My name is " + MY_NAME + " " + args[0],"Dialog:", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
