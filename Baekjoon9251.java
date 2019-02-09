package Main;
import java.util.*;
public class Baekjoon9251 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = new String();
		String b = new String();
		a = sc.next();
		b = sc.next();
		int [][]dp = new int[1001][1001];
		for(int i=1;i<=a.length();i++) {
			for(int j=1; j<=b.length();j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				if(a.charAt(i-1) == b.charAt(j-1))
					dp[i][j] = dp[i-1][j-1] + 1;
			}
		}
		System.out.println(dp[a.length()][b.length()]);
		sc.close();
	}

}
