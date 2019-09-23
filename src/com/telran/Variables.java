package com.telran;

import javax.swing.*;
import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {
        byte a = -128;
        int b = a;
        System.out.println(a + " - " + b);

        byte p = 2;
        byte m = 3;

        System.out.println("Summe: " + (p + m));
    }
}
