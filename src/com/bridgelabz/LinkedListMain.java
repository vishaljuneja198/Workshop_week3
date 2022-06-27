package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to Data Structure and Algorithm program ");
        LinkedList l1 = new LinkedList();

        int x;
        System.out.println("How many element you required in linkedList ");
        x=sc.nextInt();
        for( int i=1;i<=x;i++){
            int y;
            System.out.println("enter the key value of node"+ i +"=");
            y=sc.nextInt();
            l1.push(y);

        }
        l1.print();
int z;
        System.out.println("enter the pervious key value which you want to delete z= ");
        z= sc.nextInt();
   Node Address_deleted_node = l1.search(z);

    l1.pop(Address_deleted_node);


    }
}