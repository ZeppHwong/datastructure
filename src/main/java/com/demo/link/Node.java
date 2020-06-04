package com.demo.link;

public class Node<T> {
    private T data;
    private Node next;

    private Node(T dataPortion){
        this(dataPortion, null);
    }

    private Node(T dataPortion, Node nextNode){
        data = dataPortion;
        next = nextNode;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
