package Main;
import java.util.*;
public class Baekjoon2616 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp;
		int [] train = new int[N+1];
		int [][] cache = new int[4][N+1];
		for(int i=1;i<=N;i++) {
			temp = sc.nextInt();
			train[i] = train[i-1] + temp;
		}
		int n = sc.nextInt();
		for(int i=1;i<=3;i++) {
			for(int j=n*i;j<=N;j++)
				cache[i][j] = Math.max(cache[i][j-1], train[j] - train[j-n] + cache[i-1][j-n]);
		}
		System.out.println(cache[3][N]);
		sc.close();
	}

}
