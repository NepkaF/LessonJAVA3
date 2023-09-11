import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1=n;
        int s[] = new int[n];
        for (int i=0;i<n;i++) {
            s[i]=scanner.nextInt();
        }

        for (int i=0;i<n;i++) {
            if (s[i]%2 == 0) {
                s[i]= 0;
                n1=n1-1;
            }
            else System.out.println(s[i]);
        }
        int[] d = new int[n1];
        int j=0;
        for (int i=0;i<n;i++){
            if (s[i]!=0){
                d[j]=s[i];
                j++;
            }
        }
        System.out.println(Arrays.stream(d).max());
        System.out.println(Arrays.stream(d).min());
        System.out.println(Arrays.stream(d).sum()/d.length);
    }
}