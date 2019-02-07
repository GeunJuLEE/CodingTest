package Main;
import java.util.*;
public class Baekjoon7579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int memory[] = new int[N+1];
		int cost[] = new int[N+1];
		int dp[][] = new int[N+1][10001];
		for(int i=1;i<=N;i++)
			memory[i] = sc.nextInt();
		for(int i=1;i<=N;i++)
			cost[i] = sc.nextInt();
		for(int i=0;i<=N;i++)
			Arrays.fill(dp[i], -1);
		dp[0][0] = 0;
		for(int i=1;i<=N;i++) {
			for(int j=0;j<=10000;j++) {
				if(dp[i-1][j]>=0) {
					int a = j;
					int mem = 0;
					for(int k=0; k<2; k++) {
						dp[i][a] = Math.max(dp[i][a], dp[i-1][j] + mem);
						mem = memory[i];
						a = j+cost[i];
					}
				}
			}
		}
		for(int i=0;i<=10000;i++) {
			if(dp[N][i] >= M) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
	}

}
