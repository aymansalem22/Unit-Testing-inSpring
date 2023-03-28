package com.paltecno.unittesting;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {

	int findIndex(int[] array, int number) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number)
				index = i;
		}
		return index;
	}

	boolean searchNumber(int[] array, int numberToSearchFor) {
		boolean found = false;
		for (int i : array) {
			if (array[i] == numberToSearchFor) {
				found = true;
				return found;
			}
		}
		return found;
	}

	int[] sortArray(int[] numbers) {
		return new int[] {};
	}

	void printArray(int[] array, int index) {
		System.out.println(array[index]);
	}
}
