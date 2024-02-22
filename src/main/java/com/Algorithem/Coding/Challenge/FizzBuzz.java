package com.Algorithem.Coding.Challenge;

public class FizzBuzz {
  /**
    Write a short program that prints each number from 1 to 100 in a new line.

   For each multiple of 3 print "Fizz" instead of the number.
   For each multiple of 5 print "Buzz" instead of the number.
   For each multiple of both 3 and 5 print "FizzBuzz" instead of the number.
   **/

    public static void print( int num){
        for (int i = 1; i <=num ; i++) {
             if ((i%3==0) && (i%5==0)) {
                System.out.println("Fizz-Buzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }
    public static void main(String[] args) {
        print(100);
    }

  }

