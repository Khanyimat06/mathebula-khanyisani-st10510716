/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesalesapp;
import java.until.Scanner;
/**
 *
 * @author Student
 */
public class ConsoleSalesApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        interface IConsoles {
            String getConsoleType();
            String getStore();
            int getTotalSales();
        }
    //abstract class that store data
    abstract class consoles impliments Iconsoles{
        String consolesType;
        String storeName;
        int totalSales;
     // constructor
        public console(String consoleType, String storeName, int totalsales){
            this.consoleType = consoleType;
            this.storeName = storeName;
            this.totalSales = totalSales;
        }
        public class RunApplication {
            public static void main(String[] args){
                
            }
        }
        
    }
    
    }
}
