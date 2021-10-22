public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		int length=array.length;
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+= array[i];
		}
		int average=sum/length;
		System.out.println("Average of array: "+average);
	}


}
