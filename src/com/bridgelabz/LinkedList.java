package com.bridgelabz;

public class LinkedList<K> {

    Node<K> head, tail;

    public void push(K key) {
        Node<K> newNode = new Node<>(key);
        if (head != null) {
            newNode.next = head;
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
    public Node<K> search(K key) {
        Node<K> temp = this.head;
        Node<K> node_Found = null;

        while(temp != null){

                node_Found = temp;

        }
        return node_Found;
    }

    public void pop(Node Address)
    {

    }

}