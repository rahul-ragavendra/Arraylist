package com.arraylist.Main;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              ArrayList<String> arraylist = new ArrayList<String>();
              arraylist.add("Rahul");
              arraylist.add("Chandler");
              arraylist.add("Ross");
              arraylist.add("Misra");
              arraylist.add("Arpi");
             
              Iterator<String> iterator = arraylist.iterator();
              while(iterator.hasNext()){
            	  String element = iterator.next();
            	  System.out.println("Object is "+element);
            	   iterator.remove();
              }
              if(arraylist.isEmpty()){
            	  System.out.println("Empty");
              }       
	}

}
