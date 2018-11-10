package Calculator;

public class Sum extends Calculator{
    public Sum(){
        double x = 2;
        double y = 3;
    }
    @Override
    public void calculate(double x, double y){
        System.out.println(x + y);
    }
}
