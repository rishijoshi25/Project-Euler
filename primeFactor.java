/*
 * Problem 3:-
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package ProjectEuler;

public class primeFactor {
	public static void main(String[]args) {
		double num=600851475143.0;
		double i;
		for(i=2;i<=num;i++) {
			if(num%i==0) {
				num/=i;
				i--;
			}
		}
		System.out.println(i);
	}
}
