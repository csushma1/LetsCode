import java.util.*;
class Graph{
int vertices;
LinkedList<Integer> adj[]; // Keeps track of the adjacent values
Graph(int vertice){ // Constructor , Creates the graph
vertices=vertice;
adj=new LinkedList[vertice];
for(int i=0;i<vertice;i++){
	adj[i]=new LinkedList();
}
}
void addEdge(int vertice1,int vertice2)  {  
adj[vertice1].add(vertice2);   
}

public boolean checkConnection(int source,int destination){
	boolean visited[]=new boolean[vertices];
	LinkedList<Integer> queue=new LinkedList<Integer>();
	visited[source]=true;
	queue.add(source);
	Iterator<Integer> i; 
	while(!queue.isEmpty()){
		int queueTop=queue.poll();
		int checker;
		i=adj[queueTop].listIterator();
		while(i.hasNext()){
			checker=i.next();
			if(checker == destination){
				return true;
			}
			if(!visited[checker]){
				visited[checker]=true;
				queue.add(checker);
			}
		}

	}
	return false;
}
public static void main(String args[])
    {
        // Create a graph given in the above diagram
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 		
        int u = 1;
        int v = 3;
        if (g.checkConnection(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;
 
        u = 3;
        v = 1;
        if (g.checkConnection(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;
    }

}
