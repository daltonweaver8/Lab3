/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class EvenOddCounter {
   public static void main (String [] args){
          int r = 0;
          int k = 0;
          int iseven = 0;
          int isodd =0;
          System.out.println("iterations" + " even" + " odd");
          //loop to run 10 iterations
        
          for (r = 1; r <= 10; r++){
        
          //loop to generate random numbers
        
             for (int j = 1; j <= 100; j++){
                 int n = (int)(Math.random() * 1000 + 1);
                     
                 boolean even = isEven(n);
                 if (even){
                    iseven++;      
                 }
                 else{
                    isodd++;
                 }
             }
             System.out.println(r + " " + iseven + "   " + isodd);
            
             //You have missed this
             //This will reset the even and odd count for next iteration.
             //I think this is the problem.
             //remain fine.
             iseven = 0;
             isodd = 0;
           
          }
       }
       public static boolean isEven(int number){
          return number % 2 == 0;
       }
    }