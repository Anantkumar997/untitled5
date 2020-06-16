package Function;

import java.util.Scanner;

public class FahrenheittoCelsiusTable {
    public static void printFahrenheitTable(int start, int end, int step){
        int celsius=0;
        while (start<end){
            celsius=(5*(start-32))/9;
            start=start+step;
        }
        System.out.println(start+" "+celsius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start =sc.nextInt();
        int end =sc.nextInt();
        int step =sc.nextInt();
        FahrenheittoCelsiusTable obj = new FahrenheittoCelsiusTable();
        while (start <=end) {
            obj.printFahrenheitTable(start, end, step);
            start=start+step;
        }
    }
}
