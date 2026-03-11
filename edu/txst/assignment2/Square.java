package edu.txst.assignment2;

public class Square implements Shape{
    private double side;
    /**
     * Makes a square witht the length inputted 
     * 
     * @param side length of the sides
     */
    public Square(double side){
        this.side = side;
    }

    /**
     * Returns area of the square
     * 
     * @return area as a double
     */
    @Override
    public double getArea(){
        return side * side;
    }

    /**
     * Returns class name for square
     * 
     * @return Square
     */
    @Override
    public String getClassName(){
        return "Square";
    }
    /**
     * returns description of the Square
     * 
     * @return side length as a nice string
     */
    @Override
    public String toString(){
        return "Square (s=" + side + ")";
    }
}















