public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private double slope;
    private double yIntercept;
    private double distance;
    private String equation;

    public void parseCoordinates(String rawCoord1, String rawCoord2) {
        x1 = Integer.parseInt(rawCoord1.substring(1, rawCoord1.indexOf(",")));
        y1 = Integer.parseInt(rawCoord1.substring(rawCoord1.indexOf(",") + 1, rawCoord1.length() - 1));

        x2 = Integer.parseInt(rawCoord2.substring(1, rawCoord2.indexOf(",")));
        y2 = Integer.parseInt(rawCoord2.substring(rawCoord2.indexOf(",") + 1, rawCoord2.length() - 1));
    }

    private void calcSlope() {
        slope = (double)(y2-y1)/(x2-x1);
    }

    private void calcYIntercept() {
        yIntercept = y1 - (slope * x1);
    }

    private void setEquation() {
        equation = "y = " + (y2-y1) + "/" + (x2-x1) + "x + " + yIntercept;
    }

    private void setDistance() {
        distance = Math.sqrt(
                Math.pow((double)x2-x1, 2) + Math.pow((double)y2-y1, 2)
        );
    }

    public String solveForCustomX(double customX) {
        return "(" + (double)customX + "," + (customX * slope + yIntercept) + ")";
    }

    public LinearEquation(String rawCoord1, String rawCoord2) {
        parseCoordinates(rawCoord1, rawCoord2);
        calcSlope();
        calcYIntercept();
        setEquation();
        setDistance();
    }

    public String toString() {
        return "Slope of line: " + (double)Math.round(slope * 100) / 100
                + "\nY-intercept: " + (double)Math.round(yIntercept * 100) / 100
                + "\nSlope intercept form: " + equation
                + "\nDistance between points: " + (double)Math.round(distance * 100) / 100;
    }
}
