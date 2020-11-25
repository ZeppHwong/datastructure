package com.demo.stack;

public interface StackInterFace<T> {
    /**
     * add a new entry to the top of this stack
     * @param newEntity
     */
    public void push(T newEntity);

    /**
     * remove and return this stack's top entry;
     * @return
     */
    public T pop();

    /**
     * retieves this stack's top entry
     * @return
     */
    public T peek();

    /**
     * detects whether this stack is empty
     * @return
     */
    public boolean isEmpty();

    /**
     * removes all entries from this stack
     */
    public void clear();
}
