package week1.day2;

public class IsPalindrome {
	public static void main(String[] args) {
		int inputNum=121; int outputNum=0;
		
		for (int i=inputNum; i>0; i/=10) {
			
			int remainder= i%10;
			outputNum = outputNum *10 + remainder;
			
			if (inputNum == outputNum){
				System.out.println(+inputNum+ " is palindrome");
			}
		
	}

	}
}

