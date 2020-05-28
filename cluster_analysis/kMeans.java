package cluster_analysis;

import java.security.InvalidParameterException;
import java.util.HashMap;

public class kMeans extends Point {
    private Cluster[] cluster;

    private HashMap<String, Point> data;

    public kMeans(HashMap<String, Point> sourceData, int clusterNumber){
        setData(sourceData); // initialization data list

        setCluster(clusterNumber); // initialization array of clusters
    }

    @Override
    public String toString() {
        String clusterLine = "";

        for (int i = 0; i < cluster.length; i++)
            clusterLine += "Cluster " + Integer.toString(i + 1) + " " +
                    cluster[i].toString() + "\n";

        return clusterLine.substring(0, clusterLine.length() - 1);
    }

    public void analysis() {
        createMassCenter(); // generation sources mass centers

        startAnalysis();
    }

    private void setData(HashMap<String, Point> sourceData) {
        if (sourceData.isEmpty()) throw new InvalidParameterException("The list of data is empty.");
        else data = sourceData;
    }

    private void setCluster(int clusterNumber) {
        if (clusterNumber == 0) throw new InvalidParameterException("The number of clusters is zero.");
        else {
            cluster = new Cluster[clusterNumber];
            for (int i = 0; i < cluster.length; i++) cluster[i] = new Cluster();
        }
    }

    private void createMassCenter() {
        Point[] points = new Point[data.size()];
        data.values().toArray(points);

        for (int i = 0; i < cluster.length; i++) {
            int centerIndex = (int)(Math.random() * (points.length - 1));

            cluster[i].pushCenter(points[centerIndex].getMass());
        }
    }

    private void startAnalysis(){
        boolean isAlgorthimСompleted;

        do {
            isAlgorthimСompleted = true;

            for (Cluster clusterObj : cluster)
                clusterObj.clear();

            bypassData();

            for (int i = 0; i< cluster.length; i++)
                if(!cluster[i].countingNewCenter()) isAlgorthimСompleted = false;

        } while (!isAlgorthimСompleted);
    }

    private void bypassData() {
        String[] names = new String[data.size()];
        data.keySet().toArray(names);

        Point[] points = new Point[data.size()];
        data.values().toArray(points);

        for (int i = 0; i < data.size(); i++) {
            int minDifferenceIndex = 0;
            double minDifference = Double.MAX_VALUE;

            for (int j = 0; j < cluster.length; j++) {
                if (Math.abs(Math.abs(points[i].getMass()) - Math.abs(cluster[j].getCenter()))
                        < minDifference) {
                    minDifferenceIndex = j;
                    minDifference = Math.abs(points[i].getMass() - cluster[j].getCenter());
                }
            }

            cluster[minDifferenceIndex].pushPoint(names[i], points[i].getMass());
        }
    }
}