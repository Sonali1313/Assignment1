import java.util.Scanner;
	public class First10PrimeNumbers 
	{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub

			int n1,n,i,count=0;
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter a number(how many prime numbers)");
			n1=s.nextInt();
			n=1;
			while(count<n1)
			{
				for(i=2;i<n;i++)
				{
					if(n%i==0)
					{ 
						break;
					}	
				}

					if(i==n)
					{
						System.out.println(i);
						count++;
					}
					n++;
				} 
			}
		}





