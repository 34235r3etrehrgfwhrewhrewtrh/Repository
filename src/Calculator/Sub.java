package Calculator;

public class Sub extends Calculator {
    public Sub(){
        double x = 2;
        double y = 3;
    }
    @Override
    public void calculate(double x, double y) {
        System.out.println(x - y);

    }
}
