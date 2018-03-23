package com.gsu.assignments.generic;

/**
 *
 * @author Alexandre
 * @param <E> Stack element
 */
public interface GenericStack<E> {
    
    public boolean isEmpty();
    
    public boolean isFull();
    
    public E peek();
    
    public E pop();
    
    public void push(E element);
    
    public int size();
    
    @Override
    public String toString();
    
    public boolean isExpandable();
}
