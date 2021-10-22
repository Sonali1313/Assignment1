import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the base of the Triangle:");
		int b= s.nextInt();
		System.out.println("Enter the height of the Triangle:");
		int h= s.nextInt();
		int area=(b*h)/2;
		System.out.println("Area of Triangle is :" +area);

	}

}
