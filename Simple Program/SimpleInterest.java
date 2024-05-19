
class SimpleInterest {

public double calculateSI(double p, double r, double t)
{
    return p*r*t;
}
}
class Main
{
    public static void main(String args[])
    {
        SimpleInterest si = new SimpleInterest();
        double interest = si.calculateSI(30000.5, 1.8, 1.0);
        System.out.println("The interest calculated is: " +interest);
    }
}
    

