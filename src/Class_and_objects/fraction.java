package Class_and_objects;

public class fraction {
    private int numerator;
    private int denominator;

    public fraction(int numerator,int denominator){
        this.numerator=numerator;
        if (denominator==0){
            // error out
        }
        this.denominator=denominator;
        simplify();
    }
    public int getDenominator(){
        return denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    private void simplify(){
        int gcd =1;
        int smaller = Math.min(numerator,denominator);
        for (int i = 2; i <=smaller ; i++) {
            if(numerator%i==0 && denominator%i==0) {
                gcd = i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    public void setNumerator(int n){
        this.numerator=n;
        simplify();
    }
    public void setDenominator(int d){
        if (d==0){
            return;
        }
        this.denominator=d;
        simplify();
    }
    public void print(){
        if (denominator==1){
            System.out.println(numerator);
        }else {
            System.out.println(numerator+"/"+denominator);
        }
    }
    public static fraction add(fraction f1, fraction f2){
        int newNum =f1.numerator*f2.denominator+f1.denominator*f2.numerator;
        int newDen =f1.denominator*f2.denominator;
        fraction f = new fraction(newNum,newDen);
        return f;
    }
    public void add(fraction f2){
        this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }
    public void multiply(fraction f2){
        this.numerator=this.numerator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }
}
