import java.util.ArrayList;

public class Primes{
	public static void main(String[] args){
		ArrayList<long[]> mods = new ArrayList<>();
		long[] next =  {2, 0};
		mods.add(next);
		long value = 2; 
		boolean isPrime;
		while(true){
			value++;
			isPrime = true;
			for (int i=0; i<mods.size(); i++){
				mods.get(i)[1]++;
				if (mods.get(i)[1] == mods.get(i)[0]){
					mods.get(i)[1] = 0;
					isPrime = false;
				}
			}
			if (isPrime){
				System.out.print(value);
				System.out.println(" is a prime number");
				next = new long[2];
				next[0] = value;
				next[1] = 0;
				mods.add(next);
			}
		}
	}
}