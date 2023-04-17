package arithmetics;

public class Addition {

    double xParameter;
    double yParameter;

    public Addition (double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double xParameter) {
        this.xParameter = xParameter;
    }

    public void setY(double yParameter) {
        this.yParameter = yParameter;
    }

    public double getxParameter() {
        return xParameter;
    }

    public double getyParameter() {
        return yParameter;
    }

    public void showResult () {
        double result = this.calculate(getxParameter(), getyParameter());
        System.out.println(result);
    }

    private double calculate (double x, double y) {
        return (x+y);
    }


}
