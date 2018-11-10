package Calculator;

public class Div extends Calculator {
    public Div(){
        double x = 2;
        double y = 3;
    }
    @Override
    public void calculate(double x, double y) throws ArithmeticException{
        if (y == 0.0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        System.out.println(x / y);
    }
}
