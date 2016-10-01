package dijpack;
import javax.swing.*;
 class LinkedList
{
	Node first;

	void add(Vertex v) {
		Node p = new Node();
		p.setData(v);
		if (first == null)
			first = p;
		else {
			Node q = first;
			while (q.getNext() != null) {
                            //System.out.println(q.getData().name);
				q = q.getNext();
			}
			q.setNext(p);
		}
	}

	/*void addM(int v, int pos) {
		int c = 1;
		Node p = new Node();
		p.setData(v);
		Node q = first;
		while (c != pos - 1 && q.getNext() != null) {
			q = q.getNext();
			c++;
		}
		p.setNext(q.getNext());
		q.setNext(p);
	}
         * */


	void search(Vertex v) {
		Node q = first;
		int pos = 1;
		while (q != null) {
			if (v == q.getData())
				System.out.println("Element found at Node :" + pos);
			pos++;
			q = q.getNext();
		}
	}

	void delete(Vertex v) {
		Node q = first;
		if (v == first.getData())
			first = first.getNext();
		else {
			while (q != null) {
				if (q.getNext().getData() == v)
					break;
				q = q.getNext();
			}
			System.out.println("Node Deleted : " + v);
			q.setNext(q.getNext().getNext());
		}
	}

	void addB(Vertex v) {
		Node p = new Node();
		p.setData(v);
		p.setNext(first);
		first = p;
	}

	void addL(Vertex v) {
		Node p = new Node();
		p.setData(v);
		Node q = first;
		while (q.getNext() != null) {
			q = q.getNext();
                        
		}
		q.setNext(p);
		p.setNext(null);
	}

	Node display() {
        return first;
        }
    }
		




