package FibbonacciNumber;

import java.util.Scanner;

public class Solution {

    public static boolean checkMember(int n){

        int a=0,b=1,sum;

        for(int i=1;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            if(sum==n)
            {
                return true;
            }
        }
        if(n==0)
        {
            return true;
        }
        else if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}