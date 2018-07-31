/*Problem 7 :- 10001st prime
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
package ProjectEuler;

public class prime {
	public static void main(String[]args) {
		int num=3,flag=1;
		System.out.println("The first 10001 prime numbers are---->");
		System.out.println(2);
		for(int i=2;i<=10001;) {
			for(int j=2;j<=Math.sqrt(num);j++) {
				if(num%j==0) {
					flag=0;
					break;
				}
			}
			if(flag!=0) {
				System.out.println(num);
				i++;
			}
			flag=1;
			num++;
		}
	}
}
