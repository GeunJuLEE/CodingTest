package Main;

import java.util.Scanner;

public class Baekjoon2169 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int map[][] = new int[N+1][M+1];
		int dp[][] = new int[N+1][M+1];
		int temp[][] = new int[2][M+2];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		dp[1][1] = map[1][1];
		for(int i=2;i<=M;i++)
			dp[1][i] = dp[1][i-1] + map[1][i];
		
		for(int j=2;j<=N;j++) {		
			temp[0][0] = dp[j-1][1];
			for(int i=1;i<=M;i++) {
				temp[0][i] = Math.max(temp[0][i-1],dp[j-1][i]) + map[j][i];				
			}
			temp[1][M+1] = dp[j-1][M];
			for(int i=M;i>=1;i--) {
				temp[1][i] = Math.max(temp[1][i+1],dp[j-1][i]) + map[j][i];
			}
			for(int i=1;i<=M;i++) {
					dp[j][i] = Math.max(temp[0][i], temp[1][i]);
			}
		}
		System.out.println(dp[N][M]);
		
		
		sc.close();
	}

}
