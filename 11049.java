package Main;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N+1];
		int dp[][] = new int[N+1][N+1];
		for(int i=0; i<N; i++) {
			d[i] = sc.nextInt();
			d[i+1] = sc.nextInt();
		}
		for(int dia=1; dia<N; dia++) {
			for(int i=1; i<= N-dia; i++) {
				int j = i+dia;
				dp[i][j] = Integer.MAX_VALUE;
				for(int k=i; k<=j-1;k++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j] + d[i-1]*d[k]*d[j]);
				}
			}
		}
		System.out.println(dp[1][N]);		
		sc.close();
	}
}
