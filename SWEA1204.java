package Main;
import java.util.*;
public class SWEA1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(0<T--) {
			int i = sc.nextInt();
			int arr[] = new int[101];
			for(int j=0; j<1000; j++) {
				int grade = sc.nextInt();
				arr[grade]++;
			}
			int max = 0;
			int result = 0;
			for(int j=0;j<=100;j++) {
				if(max <= arr[j]) {
					max = arr[j];
					result = j;
				}
			}
			System.out.println("#" + i + " " + result);
		}
		sc.close();

	}

}
