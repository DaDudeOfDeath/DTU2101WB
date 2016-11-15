/**
 * Created by William Ben Embarek on 08/11/2016.
 */
public class ExpoentialFunction extends Function{
    double a;
    double b;
    public ExpoentialFunction(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public double evaluate(double x)
    {
        return (Math.pow(a,b*x));
    }
}
