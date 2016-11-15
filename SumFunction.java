/**
 * Created by William Ben Embarek on 08/11/2016.
 */
public class SumFunction extends Function{
    Function[] f;
    double n;
    public SumFunction(Function[] f)
    {
        this.n = f.length;
        this.f = f;
    }
    public double evaluate(double x)
    {
        double sum = 0;
        for (int i = 0; i < n; i ++)
        {
            sum = sum + f[i].evaluate(x);
        }
        return sum;
    }
}
