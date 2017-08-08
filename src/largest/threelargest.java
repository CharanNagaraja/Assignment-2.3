package largest;

public class threelargest {
	
	public static void main(String [] args) {

	// declare three variables and initialize then
	int a=34;
	int b=3;
	int c=675;
	
	//declare a variable that hold the largest number for max method
	
	int largest = Math.max(a,  Math.max(b, c));
	
	if (largest == a) {
		System.out.println("A is the largest " + a);
	}else if (largest == b) {
		System.out.println("B is the largest " + b);
	}else {
		System.out.println("C is the largest " + c);
	}
	}
}
