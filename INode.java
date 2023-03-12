package com.bridgelabz.collection;

public interface INode<K> {
    K getkey();
    void setkey(K key);
    INode getNext();
    void setNext(INode<K> next);

}
