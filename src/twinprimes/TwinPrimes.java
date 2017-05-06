/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twinprimes;

/**
 *
 * @author Gizem
 */
public class TwinPrimes {

 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  for (int i = 2; i < 100; i++) {
 
 
   if (isPrime(i)&&isPrime(i+2)) {
    System.out.printf("(%d, %d)\n", i, i+2);
   }
  }
   
 }
  
  
 /** Check whether number is prime */
 public static boolean isPrime(int number) {
  for (int divisor = 2; divisor <= number / 2; divisor++) {
   if (number % divisor == 0) { // If true, number is not prime
    return false; // number is not a prime
   }
  }
 
  return true; // number is prime
 }
 
}
    

