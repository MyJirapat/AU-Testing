package week5;
import java.util.Scanner;

public class RomanV3 {
	public static String ones(int n) {
		String ans = "";
		if (n == 4 || n == 9) {
			if(n == 4) {
				ans = ans + "iv";
			} else {
				ans = ans + "ix";
			}
		} else if (n >= 5) {
			ans = ans +"v";
			n = n-5;
		}
		if(n >= 1 && n <4) {
			for(int i = 1; i<=n; i++) {
				ans = ans +"i";
			}
		}
		return ans;
	}
    
	public static String tens(int n) {
		String ans = "";
		if(n == 4 || n == 9) {
			if(n == 4) {
				ans = ans + "xl";
			} else {
				ans = ans + "xc";
			}
		} else if (n >= 5) {
			ans = ans +"l";
			n = n-5;
		}
		if(n >= 1 && n <4) {
			for(int i = 1; i<=n; i++) {
				ans = ans +"x";
			}
		}
		return ans;
	}
    
	public static String hundreds(int n) {
		String ans = "";
		for(int i = 1; i<=n; i++) {
			ans = ans + "c";
		}
		return ans;
	}
    
	public static int countVariable(String s , char a) {
		int total = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == a) {
				total ++;
			}
		}
		return total;
	}
    
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number to count the roman digit");
		int n = sc.nextInt();
		int a[] = new int [5];
        
		for(int j = 1; j <= n ;j++) {
			String ans= hundreds(j/100)+tens((j/10)%10)+ones(j%10);
			a[0] = a[0] + countVariable(ans,'i');
			a[1] = a[1] + countVariable(ans,'v');
			a[2] = a[2] + countVariable(ans,'x');
			a[3] = a[3] + countVariable(ans,'l');
			a[4] = a[4] + countVariable(ans,'c');
			
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
