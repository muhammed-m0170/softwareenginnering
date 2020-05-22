/**
 * 
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int l,b;
		int a = 0;
		
		System.out.println("Enter length");
		l = input.nextInt();
		System.out.println("Enter breadth");
		b = input.nextInt();
		a = l*b;
		System.out.println("area : "+ a);
		System.out.println("Hello Software Engineering World");

	}
   //This is my first comment
}
