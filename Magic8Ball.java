/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.util.Random;
import java.util.Scanner;





public class  Magic8Ball {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR MESSAGE/QUESTION :");
        
        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();
        
        Random rand = new Random();
        int r = rand.nextInt(8);
        System.out.println("YOUR NUMBER: ");
        System.out.println(r);
        System.out.println("YOUR MESSAGE: ");
        if(r == 0){
            System.out.println("My sources say no");
        } else if(r == 1){
            System.out.println("Without a doubt");
        }else if(r == 2){
            System.out.println("Ask again later!");
        } else if ( r == 3) {
            System.out.println("Don't count on it!");
        }else if(r == 4){
            System.out.println("Without a doubt");
        }else if(r == 5){
            System.out.println("It is certain!");
        } else if ( r == 6) {
            System.out.println("Cannot predict now!");
        }else if(r == 7){
            System.out.println("All will be great");
        }else if( r == 8){
            System.out.println("Yes! You will");
        }
                 
        }
    }

