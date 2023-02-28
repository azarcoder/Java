interface formula
{
    public double cir(double r);
    public double cyl(double r,double h);
    public double ell(double a,double b);
}
class Calc implements formula{
    double pi = 3.14;
    public double cir(double r)
    {
        return pi*Math.pow(r,2);
    }
    public double cyl(double r,double h)
    {
        return 2*pi*r*h+2*pi*Math.pow(r,2);
    }
    public double ell(double a,double b)
    {
        return pi*a*b;
    }
}
public class Main
{
	public static void main(String[] args) {
	    formula c1 = new Calc();
	    System.out.printf("Circle=%.2f\n",c1.cir(3));
	    System.out.printf("Cylinder=%.1f\n",c1.cyl(3,1));
	    System.out.printf("ellipse=%.2f\n",c1.ell(3,6));
	}
}
