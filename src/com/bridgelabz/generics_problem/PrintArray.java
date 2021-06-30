package com.bridgelabz.generics_problem;

public class PrintArray {

	public static void main(String[] args) {

		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
		
		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);

	}
	public static <E> void toPrint(E[] inputArray)
	{
		for(E element: inputArray)
		{
			System.out.printf("%s",element);
		}
		System.out.println();
	}

}
