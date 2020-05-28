package cluster_analysis;

public class Point {
    private double x = 0;

    private double y = 0;

    public void createPoint(double xValue, double yValue){
        x = xValue;
        y = yValue;
    }

    protected double getMass(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}