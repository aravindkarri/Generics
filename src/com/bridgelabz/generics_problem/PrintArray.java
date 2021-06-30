package com.bridgelabz.generics_problem;

public class PrintArray {

	public static void main(String[] args) {

		int[] intArray = {1,2,3,4,5};
		double[] doubleArray = {1.1,2.2,3.3,4.4};
		char[] charArray = {'H','E','L','L','O'};

		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);


	}

	private static void toPrint(double[] doubleArray)
	{
		for(double element: doubleArray)
		{
			System.out.printf("%s",element);
		}
		System.out.println();

	}

	private static void toPrint(int[] intArray) 
	{
		for(int element: intArray)
		{
			System.out.printf("%s",element);
		}
		System.out.println();


	}
	private static void toPrint(char[] charArray)
	{
		for(char element: charArray)
		{
			System.out.printf("%s",element);
		}
		System.out.println();

	}

}
