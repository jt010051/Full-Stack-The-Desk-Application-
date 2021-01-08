package com.application.expenses;

import java.util.ArrayList;

public class searchExpenses {
public static void searchExpenses(ArrayList<Integer> arrayList, Integer value) {
		boolean foundResult = false;
	    for (int expense : arrayList) {
	        if (expense == value) {
	            foundResult = true;
	        }
	    }
	    if (foundResult) {
	        System.out.println("Found expense " + value);
	    } else {
	        System.out.println("Did not find expense " + value);
	    }
    }
	
}
