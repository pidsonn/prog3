//progrm: Larger of two numbers.

public class LargerNumber
{
    static scanner console = new scanner(system.in);

    public static void main(String[] args) {
        double num1;
        double num2;
      System.out.println("Line3: The larger of "
                          + 5.6 and 10.8 is""
                          + larger(5.6,10.8));
       System.out.println(Line 4: Enter two numbers:);
            num1 = console.nextDouble();
            num2 =console.nextDouble();
            System.out.println();
            
        System.out.println("Line8: The larger of "num1
                                   + "and" + num2 + "
                                   + is" + larger(num1,num2));"



    }
        public static double larger(double x,double y)
        {
            double max;
            
            if(x>=y)
               max=x;
            else
               max=y;
             return max;
        }
}
