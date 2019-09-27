package com.telran;

import javax.swing.*;
import com.telran.ReadLine;

public class Variables {
    public static void main(String[] args) {
        byte a = -128;
        int b = a;
        System.out.println(a + " - " + b);

        byte p = 2;
        byte m = 3;

        System.out.println("Summe: " + (p + m));

        /*
			Homework:
			1001       + 10101 				=
			2^3 + 2^0  + 2^4 + 2^2 + 2^0 	=
			8   + 1    + 16  + 4   + 1 		=
			9          + 21 				= 30

			1001101 			  - 10010 		=
			2^6 + 2^3 + 2^2 + 2^0 - 2^4 + 2^1 	=
			64  + 8   + 4   + 1   - 16  + 2		=
			77					  - 18			= 59

			111 			+ 1011 				=
			2^2 + 2^1 + 2^0 + 2^3 + 2^1 + 2^0 	=
			4   + 2   + 1   + 8   + 2   + 1 	=
			7				+ 11				= 18

			10  + 11 		=
			2^1 + 2^1 + 2^0 =
			2   + 2   + 1   =
			2   + 3   		= 5
			
			Petro hat 5 apples
			Wasaj hat 3 * Petro 
			Maria hat Wasja - 7
			All apples ?
			M + p ?
		*/

		int PetroHasApples = 5;
		int WasjaHasApples = 3 * PetroHasApples;
		int MariaHasApples = WasjaHasApples - 7;
		int AllApplesAre = PetroHasApples + WasjaHasApples + MariaHasApples;
		int MariaPlusPetroHaveApples = MariaHasApples + PetroHasApples;
		
		System.out.println("Petro has " + PetroHasApples + " apples.");
		System.out.println("Wasja has 3 times apples more then Petro: " + WasjaHasApples + " apples.");
		System.out.println("Maria has 7 apples less then Wasja: " + MariaHasApples + " apples.");
		System.out.println("All together have " + AllApplesAre + " apples. Where " + MariaPlusPetroHaveApples + " only have both Maria and Petro.");

		ReadLine.ReadAndPrintString();
    }

}
