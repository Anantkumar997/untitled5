package pattern;
import java.util.Scanner;
public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int i=1;
        while(i<=N){
            int j=i;
            int k=1;
            while(k<=i){
                System.out.print(j);
                k++;
                j--;
            }
            System.out.println();
            i++;
        }

    }
}
