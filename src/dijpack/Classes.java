package dijpack;
import java.util.PriorityQueue;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Vertex implements Comparable<Vertex>
{
    public final String name;
    public EdgeList adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertex other)
    {
        return Double.compare(minDistance, other.minDistance);
    }
}

class Edge
{
    public final Vertex target;
    public final double weight;
    public Edge(Vertex argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}
