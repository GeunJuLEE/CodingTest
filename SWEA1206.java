package Main;
import java.util.Scanner;
public class SWEA1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for(int j=1; j<=T; j++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = 0;
            for(int i=2;i<n-2;i++) {
                int max = 0;
                max = Math.max(max, arr[i-2]);
                max = Math.max(max, arr[i-1]);
                max = Math.max(max, arr[i+1]);
                max = Math.max(max, arr[i+2]);
                if(arr[i]>max) {
                    result += arr[i]-max;
                }
            }
            System.out.println("#" + j + " " + result);
        }       
        sc.close();
    }
 
}
