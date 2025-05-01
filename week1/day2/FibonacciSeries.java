package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
	
	int n=8;
	int firstValue=0; int secondValue=1;
	System.out.println("Fibonacci Series upto " + n + " range:");
	for (int i=1; i<=n; ++i) {
		
		int nextValue= firstValue + secondValue;
		firstValue = secondValue;
		secondValue = nextValue;
		
		System.out.println(firstValue + " ");
		
	}
}
}
