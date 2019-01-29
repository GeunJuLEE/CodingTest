package Main;
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int [] fibo = new int[41];
		fibo[0] = 1;
		fibo[1] = 1;
		fibo[2] = 2;
		for(int i=3 ;i<41; i++)
		{
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		int n = sc.nextInt();
		int a = sc.nextInt();
		int [] arr = new int[a+2];
		arr[0] = 0;
		for(int i=1;i<a+1;i++) {
			arr[i] = sc.nextInt();
		}
		arr[a+1] = n+1;
		int [] dp = new int[a+1];
		for(int i=0;i<a+1;i++) {
			dp[i] = arr[i+1] - arr[i] - 1;
		}
		for(int i=0;i<a+1;i++) {
			result *= fibo[dp[i]];
		}
		System.out.println(result);
		sc.close();
	}
}
