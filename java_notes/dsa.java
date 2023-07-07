import java.util.Arrays;
public class dsa
{
    public static void main(String[] args)
    {
        double[] test_1 = new double[10];
        double[] test_2 = {0.4, 2.4, 5.0, 4.9, 73.4};


        for(int i=0; i < test_1.length; i++)
        {
            test_1[i] = i;
        }

        System.out.println(Arrays.toString(test_1));
    }
}