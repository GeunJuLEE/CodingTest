package Main;
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int M = sc.nextInt();
		int [] arr = new int[n+1];
		arr[0] = s;
		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
		}
		int [][]dp = new int[n+2][M+1];
		dp[1][s] = 1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=M;j++) {
				if(dp[i][j] == 1) {	
					if(j+arr[i]<=M) {
						dp[i+1][j+arr[i]] = 1;
					}
					if(0<=j-arr[i]) {
						dp[i+1][j-arr[i]] = 1;
					}	
				}
			}
		}
		int result = 0;
		for(int i=0; i<=M; i++) {
			if(dp[4][i] == 1) {
				result = i;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
