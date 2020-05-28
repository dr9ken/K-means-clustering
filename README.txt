->RU<-
Пакет классов, реализующих алгоритм кластеризации методом k-средних

Подробнее о методе : https://en.wikipedia.org/wiki/K-means_clustering

Применение:
1)Создание объекта HashMap<String, Point>
	-в объект String заносится имена предметов кластеризации 
	-в объект Point заносятся координаты предметов кластеризации (метод createPoint())
2)Создание объекта kMeans
	-в конструктор заносятся HashMap и необходимое количество кластеров
3)Вызов метода analysis()
	-метод разбивает все данные на заданное количество кластеров
4)Для получения кластеров вызывается метод toString()
	-метод возвращет строку кластеров в виде "Cluster 1 [A H G]
						 "Clusrer 2 [B N R]" и т.д. 

->ENG<-
Package of classes implementing the k-means clustering algorithm

More about the method: https://en.wikipedia.org/wiki/K-means_clustering

Application:
1)Creating a HashMap <String, Point> Object
	-the objects of clustering are entered into the String object
	-coordinates of clustering objects are entered into the Point object (createPoint() method)
2)Create a kMeans object
	-HashMap and the required number of clusters are entered into the constructor
3)Call analysis() method
	-method splits all data into a given number of clusters
4)toString () method is called to get clusters
	-method returns a row of clusters in the form "Cluster 1 [A H G]
						      "Clusrer 2 [B N R]", etc.
