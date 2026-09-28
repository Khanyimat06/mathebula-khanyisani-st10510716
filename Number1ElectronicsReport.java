/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronicsreport;

/**
 *
 * @author Student
 */
public class Number1ElectronicsReport {

    public static void main(string[] args) {
       // cities that display the number of sale yearly
        String[] cities ={"Cape Town, Port Elizabeth, Pretor"};
        int[][] sales ={
            {1000,2000,3000};
            {2000,3000,4000};
            {1500,1100,1200};
        };
    System.out.println("Gaming consele report");
    System.out.println("Cape Town 1000 2000 3000");
    System.out.println("Port Elizabeth 2000 3000 4000");
    System.out.println("Pretoria 1500 1100 1200");
    
    // sales total
    System.out.println("Sales total for each city");
    for(int i = 0; i< sales.length; i++){
          int total=sales[i][1] + sales[i][2]+ sales[i][3]
    for(int j =o; j< cities[i].length; j++ ){
    total += sales[i][j];
 
}
    }
    //Display final result
     System.out.println("cities with the most sales; + topCity")
     System.out.printl();
                
    }

