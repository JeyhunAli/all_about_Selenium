package CODE_PRACTIC;

import java.util.Scanner;
/**
 * 
 * @author jey
 *
 *java program to print an integer given by user
 */

public class PRINT_InT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your number:");
		
		int num = sc.nextInt();
		
		System.out.println("you entered " + num);

}
}