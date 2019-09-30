package com.telran;

/**
 Convert dec number to binary number
 */
public class DecToBinConverter {
	public static void main(String[] args) {
		int decNum = 371; 			// Dec number
		int copyDecNum = decNum; 	// Copy
		String binNum = ""; 		// Result binary number
		int pos = 0; 				// Position
		String strDivOnTwo = " | 2";

		System.out.println(decNum + strDivOnTwo);		// print "Number" | 2
		while (decNum > 0) {
			System.out.println("-------------------");
			pos++;

			if (decNum % 2 == 1) {
				binNum = "1" + binNum;
			} else {
				binNum = "0" + binNum;
			}

			decNum = decNum / 2;

			System.out.println(decNum + strDivOnTwo + "					" + binNum.substring(0, 1));

			if (pos % 8 == 0) binNum = "." + binNum;	// Add point for wole byte
		}

		// Add "0"'s till whole byte
		while (pos % 8 != 0) {
			binNum = "0" + binNum;
			pos++;
		}
		System.out.println("");
		System.out.println("Dec number to binary: " + copyDecNum + " = " + binNum + " in binary.");
	}
}
