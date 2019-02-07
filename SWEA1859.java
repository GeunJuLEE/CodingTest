package Main;
import java.util.*;
public class SWEA1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int num=1; num<=T; num++) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();	
			}
			int max = arr[N-1];
			long result = 0;
			for(int i=N-2; i>=0; i--) {
				if(max>arr[i]) 
					result += (max - arr[i]);	
				else
					max = arr[i];
				
			}
			System.out.println("#" + num + " " + result);
		}
		sc.close();
	}

}
