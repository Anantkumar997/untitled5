package pattern;
import java.util.*;
public class TriangleofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int i=1;

        int temp2 = 0;
        while(i<=N){
            int temp=i;
            int k=i;
            while(k<=N-1){
                System.out.print(" ");
                k=k+1;
            }
            int j=1;
            //int val=i;
            while(j<=i){
                System.out.print(temp);
                //val=val+1;
                j=j+1;
                temp2=temp;
                temp=temp+1;
                //temp2++;
            }
            int l=1;
            while(l<=i-1){
                temp2--;
                System.out.print(temp2);
                l=l+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
