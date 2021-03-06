/**
 * Created by William Ben Embarek on 08/11/2016.
 */
public class SineFunction extends Function{
    double a;
    double b;
    public SineFunction(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public double evaluate(double x)
    {
        return a*Math.sin(b*x);
    }
}
