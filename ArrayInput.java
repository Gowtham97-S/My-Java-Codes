package Array;

import java.util.Scanner;
public class ArrayInput {

	public static void main (String[]args) {
		int a[] = new int[3];
		Scanner scanner = new Scanner(System.in); //get input from the user
		System.out.println("Enter three numbers " );
		for(int i=0; i<a.length ;i++)
		a[i]=scanner.nextInt();
		System.out.println("-----");
		for(int i=0; i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
}
