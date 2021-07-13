package com.goanna;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
    	System.out.println("Client class");
    	Client c = new Client();
    	
    	ArrayList<Integer> test = new ArrayList<Integer>();
    	
    	test.add(-1);
    	test.add(2);
    	test.add(-2);
    	
    	c.squared(test);;
    	System.out.println(test);
    	

    }

    /**
     *
     * @param list
     * @return true if all items in the list are positive
     * IMPORTANT:
     * return false if list is null
     * return true if list is empty
     */
    public static boolean allPositives(ArrayList<Integer> list) {
        if(list == null)
            return false;
        for(Integer item: list) {
            if(item <= 0) { //<= means NOT positive
                return false;
            }
        } //end of loop
        return true;
    }

    /**
     *
     * @param list
     * @return true if all items in the list are even (divisible by 2)
     * IMPORTANT:
     * return false if list is null
     * return true if list is empty
     */
    public static boolean allEven(ArrayList<Integer> list) {
        if(list == null)
            return false;
        if(list.size() == 0)
        	return true;
        for(Integer item: list) {
            if(item % 2 != 0) { //<= means NOT Even
                return false;
            }
        } //end of loop
        return true;
    }

    //countInRange goes here

    /**
     *
     * @param list
     * modify the list so that each item becomes the square of its previous value
     */
    public static void squared(ArrayList<Integer> list) {
    	for (int i = 0; i < list.size(); i++) {
            list.set(i, (int)Math.pow(list.get(i), 2));
        }
    }

    /**
     *
     * @param list
     * modify the list and remove any negative items
     */
    public static void removeNegatives(ArrayList<Integer> list) {
            
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) <= 0)  //<= means NOT positive
            	list.remove(list.get(i));
            } //end of loop
        } 
       
    

}