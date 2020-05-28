package cluster_analysis;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

class Cluster{
     private double center;

     private HashMap<String, Double> dataCluster = new HashMap<>();

     public double getCenter() {
          return center;
     }

     public final void pushCenter(double center){
          this.center = center;
     }

     public void pushPoint(String name, double value){
          dataCluster.put(name, value);
     }

     public boolean countingNewCenter() {
          int sumValues = 0;

          for (Double value : dataCluster.values()) sumValues += value.doubleValue();

          double newCenter;
          if (dataCluster.size() == 0) newCenter = 0.0d;
          else newCenter = sumValues / dataCluster.size();

          if (newCenter == center) return true;
          else {
               center = newCenter;
               return false;
          }
     }

     @Override
     public String toString() {
          Set<String> keys = dataCluster.keySet();

          if (keys.isEmpty()) return "[EMPTY]";
          else return dataCluster.keySet().toString();
     }

     public void clear(){
          dataCluster.clear();
     }
}