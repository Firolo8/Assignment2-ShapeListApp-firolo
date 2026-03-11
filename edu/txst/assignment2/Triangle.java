package edu.txst.assignment2;

public class Triangle implements Shape{
    private double base;
    private double height;

    /**
     * Makes triangle with the base and height inputted
     * 
     * @param base   base length 
     * @param height height length
     */
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    /**
     * Returns area of the triangle
     * 
     * @return area given as a double
     */
    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
    /**
     * Returns class name for triangle
     * 
     * @return Triangle
     */
    @Override
    public String getClassName(){
        return "Triangle";
    }

    /**
     * returns description of the triangle
     * 
     * @return base and height in a string
     */
    @Override
    public String toString(){
        return "Triangle (b=" + base + ", h=" + height + ")";
    }
}