package dijpack;
import java.util.*;
import javax.swing.*;
class Dijkstra
{
    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
      	vertexQueue.add(source);

	while (!vertexQueue.isEmpty()) {
	    Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            EdgeNode temp=u.adjacencies.first;
            while(temp!=null)
            {
                Edge e=temp.getData();
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
		if (distanceThroughU < v.minDistance) {
		    vertexQueue.remove(v);
		    v.minDistance = distanceThroughU ;
		    v.previous = u;
		    vertexQueue.add(v);
		}
                temp=temp.getNext();
            }
        }
    }
    static void fillboxes(LinkedList vertices,JComboBox jComboBox1,JComboBox jComboBox2)
    {
    Node temp=vertices.first;
            while(temp!=null)
            {
               // System.out.println(temp.getData().name);
                jComboBox1.addItem(temp.getData().name);
                jComboBox2.addItem(temp.getData().name);
                temp=temp.getNext();
            }
}
    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);
        Collections.reverse(path);
        return path;
    }
     static Vertex Vsearch(LinkedList v1,String x)
    {
         boolean flag=false;
         Node shia=v1.first;
        
      while(shia!=null)
      {
        if(shia.getData().name.equals(x))
         {
            flag=true;
            break;
         }
        shia=shia.getNext();
      }
         if(flag)
        {
         return (shia.getData());
         }
         else 
         return null; 
    }

    public static void zehaha()
    {
      //Scanner in=new Scanner(System.in);
      GraphCreate g1=new GraphCreate();
      g1.setVisible(true);
      /* System.out.println("Nuber of verts?");
       int count=in.nextInt();
       in.nextLine();
       Vertex[] vertices=new Vertex[count];
       for(int i=0;i<count;i++)
       {
            System.out.println("Enter name");
            String s=in.nextLine();
            vertices[i]=new Vertex(s);
        }
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter number of edges for "+vertices[i].name);
            int k=in.nextInt();
            for(int ab=0;ab<k;ab++)
            {
            System.out.println("Enter edge weight and target vertices for "+vertices[i].name);
                     int edw=in.nextInt(); 
                     String edn=in.nextLine();

            
            
            Vertex craptar=Vsearch(vertices,edn);
           vertices[i].adjacencies[ab]=new Edge(craptar,edw);  
            }
        }
               
	/*v0.adjacencies = new EdgeList{ new Edge(v1, 5),
	                             new Edge(v2, 10),
                               new Edge(v3, 8) };
	v1.adjacencies = new EdgeList{ new Edge(v0, 5),
	                             new Edge(v2, 3),
	                             new Edge(v4, 7) };
	v2.adjacencies = new EdgeList{ new Edge(v0, 10),
                               new Edge(v1, 3) };
	v3.adjacencies = new EdgeList{ new Edge(v0, 8),
	                             new Edge(v4, 2) };
	v4.adjacencies = new EdgeList{ new Edge(v1, 7),
                               new Edge(v3, 2) };
	Vertex[] vertices = { v0, v1, v2, v3, v4 };
        computePaths(vertices[0]);
        for (Vertex v : vertices)
	{
	    System.out.println("Distance to " + v + ": " + v.minDistance);
	    List<Vertex> path = getShortestPathTo(v);
	    System.out.println("Path: " + path);
	}
    */
    }
}