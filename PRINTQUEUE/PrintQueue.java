/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRINTQUEUE;

/**
 *
 * @author CHI KIEN
 */
public class PrintQueue {
    class Node {
        String document;
        Node next;

        Node(String document) {
            this.document = document;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    public PrintQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(String document) {
        Node newNode = new Node(document);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public String dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return null;
        }
        String document = front.document;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return document;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();
        printQueue.enqueue("Document 1");
        printQueue.enqueue("Document 2");
        printQueue.enqueue("Document 3");

        System.out.println("Printing documents:");
        while (!printQueue.isEmpty()) {
            System.out.println("Printed: " + printQueue.dequeue());
        }
    }
}
