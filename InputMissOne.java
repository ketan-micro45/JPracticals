import java.util.InputMismatchException;
import java.util.Scanner;
class InputMissOne{
public static void main(String [] args){
	Scanner sc =new Scanner(System.in);
	try{
	System.out.println("Enter the value and get the square value of the following integer");
		Integer a=sc.nextInt();
	System.out.println((a*a));
	}
	catch(InputMismatchException ex){
	System.out.println("Enter the Integer value");
	System.out.println(ex);
	}
}
}