public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= {1,2,3,4,5};
			System.out.println(a[5]);
			try {
				int x = a[2] / 0 ;
			}
			catch(ArithmeticException e2) {
				System.out.println("division by zero is not possible");
			}
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Elements at such index does not exist");
		}
	}

}
