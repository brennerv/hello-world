package com.telran;

/**
 Convert dec number to binary number
 */
public class DecToBinConverter {
	public static void main(String[] args) {
		int decNum = 1024; // Dec number
		int copyDecNum = decNum; // Copy
		String binNum = ""; // Result binary number
		int pos = 0; // Position

		while (decNum > 0) {
			pos++;

			if (decNum % 2 == 1) {
				binNum = "1" + binNum;
			} else {
				binNum = "0" + binNum;
			}
			if (pos % 8 == 0) binNum = "." + binNum;

			decNum = decNum / 2;
		}

		while (pos % 8 != 0) {
			binNum = "0" + binNum;
			pos++;
		}
		System.out.println("Dec number: " + copyDecNum + " = " + binNum + " in binary.");
	}
}
