package com.telran;

public class Variables2 {
	public static void main(String[] args) {
		double annaApples = 3.2;
		double peterApples = 4.5;

		double totalAmount = annaApples + peterApples;

		System.out.println(totalAmount);

		float floatNum = 0.4f;
		float floatNum2 = 0.5f;
		float floatNumSum = floatNum + floatNum2;

		System.out.println(floatNumSum);

	/*
		Home work
		76543210
		10111000 to dec = 2^7 + 2^5 + 2^4 + 2^3 = 128 + 32 + 16 + 8 = 184
		371 to bin = b00000001.10011101
		371 | 2
		-----------
			185 | 2     	     					1
			-------
				92 | 2								1
				------
					46 | 2							0
					------
						23 | 2						0
						------
							11 | 2					1
							------
								5 | 2				1
								-----
									2 | 2			1
									-----
										1 | 2		0
										-----
											0 | 2	1
	 */
		System.out.println("");
		System.out.println("Home work");
		// With double data type
		double dblMariaHasApples = 1.0/3.0;
		double dblPetroHasApples = dblMariaHasApples / 2.0;
		double dblWasjaHasApples = 4.0 * (dblMariaHasApples + dblPetroHasApples);
		int intAllAmountOfApples = (int) (dblMariaHasApples + dblPetroHasApples + dblWasjaHasApples);

		System.out.println("Double data type:");
		System.out.println("Maria has apples = " + dblMariaHasApples);
		System.out.println("Petro has apples = " + dblPetroHasApples);
		System.out.println("Wasja has apples = " + dblWasjaHasApples);
		System.out.println("Amount of whole apples = " + intAllAmountOfApples);

		// With float data type
		float fltMariaHasApples = 1.0f/3.0f;
		float fltPetroHasApples = fltMariaHasApples / 2.0f;
		float fltWasjaHasApples = 4.0f * (fltMariaHasApples + fltPetroHasApples);
		intAllAmountOfApples = (int) (fltMariaHasApples + fltPetroHasApples + fltWasjaHasApples);

		System.out.println("");
		System.out.println("Float data type:");
		System.out.println("Maria has apples = " + dblMariaHasApples);
		System.out.println("Petro has apples = " + dblPetroHasApples);
		System.out.println("Wasja has apples = " + dblWasjaHasApples);
		System.out.println("Amount of whole apples = " + intAllAmountOfApples);


	}
}
