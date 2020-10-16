package Primes;

import java.util.ArrayList;

public class Primes{
	public static void main(String[] args){
		ArrayList<long[]> mods = new ArrayList<>();
		// first number is a prime number, the second is the remainder of the value divided by the listed prime. 
		long[] next =  {2, 0};
		mods.add(next);
		long value = 2; 
		boolean isPrime;
		while(true){
			value++;
			// increment the number being checked
			isPrime = true;
			for (int i=0; i<mods.size(); i++){
				//increment all remainders by one
				mods.get(i)[1]++;

				// if a remainder equals the prime it is associated with, the current value is divisible by said prime, and is therefore not prime.
				if (mods.get(i)[1] == mods.get(i)[0]){
					//reset remainder to 0
					mods.get(i)[1] = 0;
					isPrime = false;
				}
			}
			if (isPrime){
				System.out.print(value);
				System.out.println(" is a prime number");
				// adds a new prime-remainder combo to keep track of. 
				next = new long[2];
				next[0] = value;
				next[1] = 0;
				mods.add(next);
			}
		}
	}
}