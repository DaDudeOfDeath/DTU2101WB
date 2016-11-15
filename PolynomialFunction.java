/**
 * Created by William Ben Embarek on 08/11/2016.
 */
public class PolynomialFunction extends Function {
    double[] a;
    int n;
    double sum;
    public PolynomialFunction(double[] a)
    {
        this.n = a.length;
        this.a = a;
    }
    public double evaluate(double x)
    {
        for (int i = 0; i < n; i++)
        {
            sum = sum + (a[i]*Math.pow(x,i));
        }
        return sum;
    }
}
