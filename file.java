import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("enter a A: ");
		int A = scan.nextInt();

		System.out.println("Enter B: ");
		int B = scan.nextInt();

		System.out.println("Enter B: ");
		int C = scan.nextInt();

		System.out.println("enter D: ");
		int D = scan.nextInt();

		int Perimeter =  A+B+C+D;
		System.out.println("perimeter is: " + Perimeter);
	}
}