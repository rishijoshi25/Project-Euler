/*
 * Problem 10:- 
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

package ProjectEuler;

public class sumPrime {
	public static void main(String[]args) {
		double sum=0;
		for(int i=2;i<=2000000;i++) {
			int flag=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}