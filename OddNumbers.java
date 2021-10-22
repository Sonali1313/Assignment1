import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		System.out.println("Enter n1 and n2:");
		Scanner r= new Scanner(System.in);
		n1=r.nextInt();
		n2=r.nextInt();
		for(int i=n1;i<=n2;i=i+2)
		{
			System.out.print(i +" ");
		}


	}

}
