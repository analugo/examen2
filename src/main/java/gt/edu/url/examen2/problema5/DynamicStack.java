/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema5;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 *
 * @author Ana Godínez
 */
public class DynamicStack<E> implements Stack<E> {
    
    private E[] vlue;
    private int sze = 0;

  
   
    private static class Node<E> {
        private E element;
        private Node<E> prev; //Anterior
        private Node<E> next; //Siguiente
        
        public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
}
        public E getElement() throws IllegalStateException {
			if (next == null) // Nodo no valido
				throw new IllegalStateException("Posicion invalida");
			return element;
		}
		
		public void setElement(E e) {
			element = e;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
        }
        private Node<E> header = null;// Referencia
	private Node<E> trailer = null;
	private int size = 0;

	public DynamicStack() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
        }
        
        public E removeLast() {
		if (isEmpty())
			return null;
		return remove(trailer.getPrev());
}
        private void addBetween(E e, Node<E> pred, Node<E> succ) {
		Node<E> newest = new Node<>(e, pred, succ);
		succ.setPrev(newest);
		pred.setNext(newest);
		size++;
		
        }   
          @Override
            public int size() {
            return sze;
    }

           @Override
            public boolean isEmpty() {
            return sze == 0;
    }

           @Override
           public void push(E e) {
           addBetween(e,trailer.getPrev(),trailer);
    }

           @Override
           public E top() {
           return this.removeLast();
    }

           @Override
           public E pop() {
           return removeLast();
    }
    
        
        public E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement();
		node.setElement(null);
		node.setNext(null);
		node.setPrev(null);
		return answer;
    }
}        
        
    
    
    
    
    
    

