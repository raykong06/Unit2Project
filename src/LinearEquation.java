public class LinearEquation {
    // Instance Variables
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

        return ("y = " + String.format("%.2f",slope) + "x + " + String.format("%.2f",yIntercept));
    }

    public double distance()
    {
        distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return distance;
    }

    public void solvedCoord(double x3)
    {
        y3 = slope * x3 + yIntercept;
        System.out.println("(" + String.format("%.2f",x3) + "," + String.format("%.2f",y3) + ")");
    }

    public String toString()
    {
        statement = "First Pair: (" + x1 + "," + y1 + ")\n" +
                "Second Pair: (" + x2 + "," + y2 + ")\n" +
                "Slope of Line: " + String.format("%.2f",slopeCalculator()) + "\n" +
                "Y-Intercept: " + String.format("%.2f",yIntercept()) + "\n" +
                "Slope-Intercept Form: " + slopeInterceptForm() + "\n" +
                "Distance Between Points: " + String.format("%.2f",distance());
        return statement;
    }
}
