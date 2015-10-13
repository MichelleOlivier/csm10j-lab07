package csm10jlab07;
/**
 *
 * @author Michelle
 */
public class Line 
{
    private double a = 0;
    private double b = 0;
    private double c = 0;
    
    public Line()
    {
        
    }
    public Line(double _a, double _b, double _c)
    {
        setA(_a);
        setB(_b);
        setC(_c);
    }
    public boolean slopeIsDefined()
    {
    return b != 0;
    }
   
    public double getSlope() 
   {
        double slope = 0;
        
        if (slopeIsDefined ())
        {
            slope = -a/b;
        }
        
        return slope;
   }
   public double getA()
   {
       return a;
   }
   public void setA(double _a)
   {
       a = _a;
   }
   public double getB()
   {
       return b;
   }
   public void setB(double _b)
   {
       b = _b;
   }
   public double getC()
   {
       return c;
   }
    public void setC(double _c)
   {
       c = _c;
   }
   public boolean equals(Line otherLine) 
   {
       return   (getA() == otherLine.getA()&&
                getB() == otherLine.getB()&&
                getC() == otherLine.getC());
   }
   
   public boolean parallelTo(Line otherLine)
   {    
        return ((getSlope() == otherLine.getSlope()) || (isVertical() && otherLine.isVertical()));
   }
   
   public boolean perpendicularTo(Line otherLine)
   {
       return ((isHorizontal() && otherLine.isVertical() ||
              (isVertical() && otherLine.isHorizontal()) ||
              (getSlope() + otherLine.getSlope() == -1)));
   }
   public boolean isVertical()
   {
       return b == 0;
   }
   public boolean isHorizontal()
   {
       return a == 0;
   }
}
