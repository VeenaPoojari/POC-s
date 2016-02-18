package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;

public class GSONReadingFromFileExample 
{

	public static void main(String[] args) {

		  Gson gson = new Gson();
		   
		  try {
		  
		   System.out.println("Reading JSON from a file");
		   System.out.println("----------------------------");
		   
		   BufferedReader br = new BufferedReader(
		     new FileReader("file.json"));
		   
		    //convert the json string back to object
		   Country countryObj = gson.fromJson(br, Country.class);
		   
		   System.out.println("Name Of Country: "+countryObj.getName());

		   
		   System.out.println("Population: "+countryObj.getPopulation());

		   System.out.println("States are :");
		   
		   List<String> listOfStates = countryObj.getListOfStates();
		   
		   			for (int i = 0; i < listOfStates.size(); i++) 
		   			{
		   					System.out.println(listOfStates.get(i));
		   			}
		  
		  } 
		  catch (IOException e) {
		   e.printStackTrace();
		  }
		 }
	
}
