/**
 * This is an implement class of Sieve
 * this class creates a numberList from user's input
 * and take only the primes into another list as the return
 * 
 * @author Duong H Chau
 * @Version Assignment 9: Sieve of Eratosthenes
 */ 
public class SieveofEratosthenes implements Sieve {
   
  /**
   * a method that creates a numberList bases on user's input
   * creates a primeList of prime numbers from the numberList
   */ 
   public java.util.List<Integer> getPrimes(int n){
     // declare and instantiate a numberList and a primeList
     java.util.ArrayList<Integer> primeList = new java.util.ArrayList<Integer>();
     java.util.ArrayList<Integer> numberList = new java.util.ArrayList<Integer>();
     
     // add numbers into numberList
     for (int i = 2; i <= n; i++){
       numberList.add(i);
     }
//     for (int i = 0; i < primeList.size(); i++){
//       primeList.remove(i);
//       i--;
//     }
     
     //remove all non-primes number from the list. add the prime to prime list
     while(numberList.size() > Math.sqrt(n)){
       int currentPrime = numberList.get(0);
       primeList.add(currentPrime);
       for (int i = 0; i < numberList.size(); i ++){
         if(numberList.get(i) % currentPrime == 0) {
           numberList.remove(i);
         }
       }
     }
     // add the remaining primes to primeList
     for(int i = 0; i < numberList.size(); i++){
       primeList.add(numberList.get(i));
     }
     return primeList;
   }
}