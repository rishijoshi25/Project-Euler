/*Problem:16 Power Digit Sum:-

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

*/

package ProjectEuler;

public class power {
	public static void main(String[]args) {
		double sum=0;
		double num=Math.pow(2,15);
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		System.out.println(sum);
	}
}
