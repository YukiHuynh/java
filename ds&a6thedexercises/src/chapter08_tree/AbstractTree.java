package chapter08_tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.TreeNode;
import chapter06.queue.LinkedQueue;
import chapter06.queue.Queue;
import chapter07.list_and_iterator.Position;

public abstract class AbstractTree<E> implements Tree<E> {

	public boolean isInternal(Position<E> p) {
		return numChildren(p) > 0;
	}
	public boolean isExternal(Position<E> p) {
		return numChildren(p) == 0;
	}
	
	public boolean isRoot(Position<E> p) {
		return p == root();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int depth(Position<E> p) {
		if(isRoot(p)) {
			return 0;
		} else {
			return 1 + depth(p);
		}
	}
	
	private int heightBad() {
		int h = 0;
		for(Position<E> p : positions()) {
			if(isExternal(p)) {
				h = Math.max(h, depth(p));
			}
		}
		return h;
	}
	
	public int height(Position<E> p) {
		int h = 0;
		for(Position<E> c : children(p)) {
			h = Math.max(h, 1 + height(c));
		}
		return h;
	}
	
	private class ElementIterator implements Iterator<E>{
		Iterator<Position<E>> posIterator = positions().iterator();
		public boolean hasNext() {
			return posIterator.hasNext();
		}
		
		public E next() {
			return posIterator.next().getElement();
		}
		
		public void remove() {
			posIterator.remove();
		}
	}
	
	public Iterator<E> itorator() {
		return new ElementIterator();
	}
	
	public Iterable<Position<E>> positions() {
		return preorder();
	}
	
	private void preorderSubtree(Position<E> p, List<Position<E>> snapshot) {
		snapshot.add(p);
		for(Position<E> c : children(p)) {
			preorderSubtree(c, snapshot);
		}
	}
	
	private Iterable<Position<E>> preorder() {
		List<Position<E>> snapshot = new ArrayList<>();
		if(!isEmpty()) {
			preorderSubtree(root(), snapshot);
		}
		return snapshot;
	}
	
	private void postorderSubtree(Position<E> p, List<Position<E>> snapshot) {
		for(Position<E> c : children(p)) {
			postorderSubtree(c, snapshot);
		}
		snapshot.add(p);
	}
	
	public Iterable<Position<E>> postorder() {
		List<Position<E>> snapshot = new ArrayList<>();
		if(!isEmpty()) {
			postorderSubtree(root(), snapshot);
		}
		return snapshot;
	}
	
	@SuppressWarnings("unchecked")
	public Iterable<Position<E>> breadthfirst() {
		List<Position<E>> snapshot = new ArrayList<>();
		if(!isEmpty()) {
			Queue<Position<E>> fringe = new LinkedQueue<>();
			fringe.enqueue((Position<Position<E>>) root());
			while(!fringe.isEmpty()) {
				Position<E> p = fringe.dequeue();
				snapshot.add(p);
				for(Position<E> c : children(p)) {
					fringe.enqueue((Position<Position<E>>) c);
				}
			}
		}
		return snapshot;
	}
	
	/** Prints preorder representation of subtree of T rooted at p having depth d. */
	public static <E> void printPreordeIndent(Tree<E> T, Position<E> p, int d) {
		System.out.println(spaces(2*d) + p.getElement( ));
		for(Position<E> c : T.children(p)) {
			printPreordeIndent(T, c, d+1);
		}
	}
	
	public static String spaces(int n) {
	    return " ".repeat(n);
	}
	
	/** Prints labeled representation of subtree of T rooted at p having depth d. */
	public static <E> void printPreorderLableed(Tree<E> T, Position<E> p, ArrayList<Integer> path) {
		int d = path.size();				// depth equals the length of the path
		System.out.println(spaces(2*d));	// print indentation, then label
		for(int i = 0; i < d; i++) {
			System.out.println(path.get(i) + (i == d-1 ? " " : "."));
		}
		System.out.println(p.getElement());
		path.add(1);
		for(Position<E> c : T.children(p)) {
			printPreorderLableed(T, c, path);
			path.set(d, 1 + path.get(d));
		}
		path.remove(d);
	}
	
	/** Returns total disk space for subtree of T rooted at p. */
	public static int diskSpace(Tree<Integer> T, Position<Integer> p) {
		int subtotal = p.getElement();		// we assume element represents space usage
		for(Position<Integer> c : T.children(p)) {
			subtotal += diskSpace(T, c);
		}
		return subtotal;
	}
	
	/** Prints parenthesized representation of subtree of T rooted at p. */
	public static <E> void parenthesize(Tree<E> T, Position<E> p) {
		System.out.println(p.getElement());
		if(T.isInternal(p)) {
			boolean firstTime = true;
			for(Position<E> c : T.children(p)) {
				System.out.println((firstTime ? " (" : ", "));	// determine proper punctuation
				firstTime = false;								// any future passes will get comma
				parenthesize(T, c);								// recur on child
			}
			System.out.println(")");
		}
	}
	
}
