# K-Menas clustering algorithm
Package of classes implementing the k-means clustering algorithm

More about the method: https://en.wikipedia.org/wiki/K-means_clustering

Application:
1. Creating a HashMap <String, Point> Object
	* the objects of clustering are entered into the String object
	* coordinates of clustering objects are entered into the Point object (createPoint() method)
2. Create a kMeans object
	* HashMap and the required number of clusters are entered into the constructor
3. Call analysis() method
	* method splits all data into a given number of clusters
4. toString () method is called to get clusters
	* method returns a row of clusters in the form "Cluster 1 [A H G]", "Clusrer 2 [B N R]", etc.
