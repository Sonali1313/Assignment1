import java.util.Scanner;
public class NumberFormatExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number;
Scanner sc =new Scanner(System.in);
while (true) {
	System.out.println("Enter any valid Integer: ");
	try {
		number=Integer.parseInt(sc.next());
		System.out.println("You entered: "+number);
		break;
	}catch (NumberFormatException e) {
		System.out.println("NumberFormatException ocured");
	}
}
	}

}
