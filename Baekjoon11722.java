package Main;
import java.util.*;
public class Baekjoon11722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] A = new int[1000];
		int [] dp = new int[1000];
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			dp[i] = 1;		
			for(int j=0;j<=i;j++) {
					if(A[j] > A[i] && dp[j] + 1 > dp[i])
						dp[i] = dp[j] + 1;
			}
		}
		System.out.println(dp[N-1]);
		sc.close();
	}

}
