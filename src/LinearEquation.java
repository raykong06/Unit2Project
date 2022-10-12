import java.text.DecimalFormat;
public class LinearEquation {
    // Instance Variables
    DecimalFormat df = new DecimalFormat("0.00");
    DecimalFormat dft = new DecimalFormat("0");

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double rise;
    private double run;
    private double slope;
    private double inverse;
    private double yIntercept;
    private String equation;
    private double distance;
    private double x3;
    private double y3;
    private String statement;

    // Constructor
    public LinearEquation(int x1Coord, int y1Coord, int x2Coord, int y2Coord)
    {
        // assign parameters to variables to be used in methods
        x1 = x1Coord;
        y1 = y1Coord;
        x2 = x2Coord;
        y2 = y2Coord;
    }

    // Methods
    public double slopeCalculator()
    {
        rise = y2 - y1;
        run = x2 - x1;
        slope = rise / run;
        return slope;
    }

    public double yIntercept()
    {
        inverse = slope * x1 * -1;
        yIntercept = inverse + y1;
        return yIntercept;
    }

    public String slopeInterceptForm()
    {
        return ("y = " + slope + "x + " + yIntercept);
    }

    public double distance()
    {
        distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return distance;
    }

    public void solvedCoord(double x3)
    {
        y3 = slope * x3 + yIntercept;
        System.out.println("(" + x3 + "," + y3 + ")");
    }

    public String toString()
    {
        statement = "First Pair: (" + x1 + "," + y1 + ")\nSecond Pair: (" + x2 + "," + y2 + ")\nSlope of Line: " + slopeCalculator() + "\nY-Intercept: " + yIntercept() + "\nSlope-Intercept Form: " + slopeInterceptForm() + "\nDistance Between Points: " + distance();
        return statement;
    }
}
