package edu.uqu.cs;
import java.util.Scanner;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/


/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
//////**** first method ****/////
 public static void twisters(){
     for(int count =1;count<=20;count++){
        if(count%2==0){
          System.out.print("Tweetle");
         if(count%4==0)
           System.out.print("Beetle");
          if(count%6==0)  
            System.out.print("Poodle");}
     else
            System.out.print(" "+count+" ");}
     System.out.println();
   }
   /////**** second method ****/////
           public static void phoneKeypad (String str){  
        str= str.toLowerCase();   
      for(int count =0; count<str.length();count++){
          if(str.charAt(count)==' ')
              continue;        
      switch(str.charAt(count){
          case 'a','b','c':
              System.out.print("2");
              break;
          case 'e','d','f':
              System.out.print("3");
              break;
          case 'g','h','i':
              System.out.print("4");
              break;
          case 'j','k','l':
              System.out.print("5");
              break;   
          case 'm','n','o':
              System.out.print("6");
              break;   
          case 'p','q','r','s':
              System.out.print("7");
              break;   
          case 't','u','v':
              System.out.print("8");
              break; 
          default:
              System.out.print("9");
              break;
      }}
  }
    /////
    //I am the student who told you about github.
    //It keeps saying there is an error, even though the code is correct when I try on NetBeans
    /////
    public static void main(String [] args) {
        

        /* Write your code here */
     
       //call method twisters()
       //prompt user to enter a string 
       //call method phoneKeypad(string)
       Scanner in=new Scanner(System.in);
        twisters();
        
        System.out.println("Enter a sentence");
        String str=in.nextLine();
         phoneKeypad(str);
        

    }

}
