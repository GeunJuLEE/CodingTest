package Main;
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		int dp[] = new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i] = sc.nextInt();
		sc.close();
		dp[1] = 0;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=arr[i];j++) {
				if(i+j>n)
					continue;
				if(dp[i+j]==0)
					dp[i+j] = dp[i] + 1;
				else
					dp[i + j] = Math.min(dp[i + j],dp[i]+1);
			}
		}
		if(dp[n]!=0)
			System.out.print(dp[n]);
		else
			System.out.print(-1);
	}
}
