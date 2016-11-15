/**
 * Created by William Ben Embarek on 08/11/2016.
 */
public class FunctionComposition extends Function{
    Function[] f;
    public FunctionComposition(Function[] f)
    {
        this.f = f;
    }
    public double evaluate(double x)
    {
        int n = f.length;
        double sum;
        sum = f[n-1].evaluate(x);
        for (int i = n-2; i > 0; i--)
        {
            sum = f[i].evaluate(sum);
        }
        return sum;
    }
}
