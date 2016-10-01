package dijpack;

class Node {
	Node next;
	Vertex data;

	void setData(Vertex v) {
		data = v;
	}

	void setNext(Node n) {
		next = n;
	}

	Vertex getData() {
		return data;
	}

	Node getNext() {
		return next;
	}
}
class EdgeNode {
	EdgeNode next;
	Edge edge;

	void setData(Edge v) {
		edge = v;
	}

	void setNext(EdgeNode n) {
		next = n;
	}

	Edge getData() {
		return edge;
	}

	EdgeNode getNext() {
		return next;
	}
}
