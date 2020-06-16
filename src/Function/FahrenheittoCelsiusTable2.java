package Function;

public class FahrenheittoCelsiusTable2 {
    public static void printFahrenheitTable(int start, int end, int step){
        int celsius=0;
        while (start<end){
            celsius=(5*(start-32))/9;
            System.out.println(start+" "+celsius);
            start=start+step;
        }

    }

    public static void main(String[] args) {

    }
}
