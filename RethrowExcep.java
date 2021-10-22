public class RethrowExcep {

	public static void test1() throws Exception {
		// TODO Auto-generated methoD
		System.out.println("the Exception in test1() method");
		throw new Exception ("thrown from test1() method");
	}
	public static void test2() throws Throwable{
		try {
			test1();
		}
		catch(Exception e) {
			System.out.println("Inside test2()method");
			throw e;
		}
	}
	public static void main(String[] args) throws Throwable {
		try {
			test2();
		}catch (Exception e) {
			System.out.println("Caught in main");
		}
	}

}

