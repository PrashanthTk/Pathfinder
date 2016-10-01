/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dijpack;

/**
 *
 * @author TanManBun
 */
public class EdgeList {

	EdgeNode first;

	void add(Edge v) {
		EdgeNode p = new EdgeNode();
		p.setData(v);
		if (first == null)
			first= p;
		else {
			EdgeNode q = first;
			while (q.getNext() != null) {
				q = q.getNext();
			}
			q.setNext(p);
		}
	}

	
	void addB(Edge v) {
		EdgeNode p = new EdgeNode();
		p.setData(v);
		p.setNext(first);
		first = p;
	}

    }






