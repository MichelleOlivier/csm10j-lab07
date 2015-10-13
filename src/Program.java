package csm10jlab07;

import csm10jlab07.Line; 
public class Program { 
    public static void main(String[] args){ 
        // test cases 
        // default constructor 
        Line slopeOfOne = new Line(); 
        // test the get / set methods 
        System.out.println("Test Get / Set"); 
        slopeOfOne.setA(-1); 
        System.out.println("A == -1 ? " + (slopeOfOne.getA() == -1)); 
        slopeOfOne.setB(1); 
        System.out.println("B == 1 ? " + (slopeOfOne.getB() == 1)); 
        slopeOfOne.setC(1); 
        System.out.println("C == 1 ? " + (slopeOfOne.getC() == 1)); 
        System.out.println(); 
        // special constructor 
        Line slopeOfTwo = new Line(-2, 1, 2);     
        System.out.println("Test special constructor"); 
        System.out.println("A == -2 ? " + (slopeOfTwo.getA() == -2)); 
        System.out.println("B == 1 ? " + (slopeOfTwo.getB() == 1)); 
        System.out.println("C == 2 ? " + (slopeOfTwo.getC() == 2)); 
        System.out.println(); 
        // slope defined 
        System.out.println("Test slope defined"); 
        Line slopeDefineTest = new Line (6, 9, 5);
        System.out.println("Slope defined ? " + slopeDefineTest.getSlope()); 
        System.out.println(); 
        // slope undefined 
        System.out.println("Test slope undefined"); 
        Line slopeUndefineTest = new Line ();
        System.out.println("Slope NaN ? " + !slopeUndefineTest.slopeIsDefined()); 
        System.out.println(); 
        // Not required, but probably good to do 
        // Horizontal 
        System.out.println("Test Horizontal");
        Line lineHorizontalTest = new Line (0, 2, 9);
        System.out.println("IsHorizontal ? " + lineHorizontalTest.isHorizontal()); 
        // not horizontal 
        lineHorizontalTest.setA(2);
        System.out.println("Not Horizontal ? " + !lineHorizontalTest.isHorizontal()); 
        System.out.println(); 
        // Not horizontal 
        // Not required, but probably good to do 
        // vertical 
        System.out.println("Test Vertical");
        Line lineVerticalTest = new Line (4, 0, 9);
        System.out.println("IsVertical ? " +  lineVerticalTest.isVertical()); 
        // not vertical 
        lineVerticalTest.setB(4);
        System.out.println("Not Vertical ? " + !lineVerticalTest.isVertical()); 
        System.out.println(); 
        System.out.println("Test parallel"); 
        Line firstLine = new Line (3, 0, 7);
        Line secondLine = new Line (5, 0, 8);
        // parallelTo         
        System.out.println("Are parallel? " + firstLine.parallelTo(secondLine)); 
        // not parallelTo 
        firstLine.setB(6);
        System.out.println("Are not parallel? " + !firstLine.parallelTo(secondLine)); 
        System.out.println(); 
        // perpendicularTo 
        System.out.println("Test perpendicular"); 
        Line firstPerpLine = new Line (3, 0, 6);
        Line secondPerpLine = new Line (0, 5, 8);
        System.out.println("Are perpendicular? " + firstPerpLine.perpendicularTo(secondPerpLine)); 
        // not perpendicularTo 
        firstPerpLine.setB(4);
        System.out.println("Are not perpendicular? " + !firstPerpLine.perpendicularTo(secondPerpLine)); 
        System.out.println(); 
        System.out.println("Test equality"); 
        Line firstEqualLine = new Line (3, 6, 9);
        Line secondEqualLine = new Line (3, 6, 9);
        // equal (same coefficient) 
        System.out.println("Same coefficients, are equal? " + firstEqualLine.equals(secondEqualLine)); 
        // equal (multiple of coefficients) 
        /*System.out.println("Different coefficients, same multiplier, are equal? " + ); 
        // not equal 
        System.out.println("Are not equal? " +  );*/ 
    } 
} 
