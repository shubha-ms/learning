package com.algorithms.learning.utility;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	
	public List<Integer> bubbleSort(List<Integer> inputArray) {
		
		for(int i=0; i<=inputArray.size()-2; i++) {
			
			for(int j=0; j<=inputArray.size()-2-i; j++) {
				if(inputArray.get(j+1) < inputArray.get(j)) {
					int temp = inputArray.get(j+1);
					inputArray.set(j+1, inputArray.get(j));
					inputArray.set(j, temp);					
				}
			}
			
		}
		
		return inputArray;
		
	}

	public static void main(String[] args) {
		
		List<Integer> inputArray = new ArrayList<>();
		inputArray.add(89);
		inputArray.add(45);
		inputArray.add(68);
		inputArray.add(90);
		inputArray.add(29);
		inputArray.add(34);
		inputArray.add(17);
		
		BubbleSort bubbleSort = new BubbleSort();
		inputArray = bubbleSort.bubbleSort(inputArray);
		
		for(int i=0; i<inputArray.size(); i++) {
			System.out.println(inputArray.get(i));
		}
		
	}
	
}
