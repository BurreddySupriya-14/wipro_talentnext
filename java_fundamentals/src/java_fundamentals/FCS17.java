package java_fundamentals;

public class FCS17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=44,temp,rev=0,dig;
		temp=num;
		while(num!=0) {
			dig=num%10;
			rev=rev*10+dig;
			num/=10;
		}
		if(temp==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
