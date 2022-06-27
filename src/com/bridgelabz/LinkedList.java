package com.bridgelabz;

public class LinkedList<K>{

    Node<K> head, tail;
    public void push(K key){
        Node<K> newNode = new Node<K>(key);
        if (head != null) {
            head.next = newNode;
        }
        head = newNode;
    }

    public void print() {
        Node<K> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }

    }

}