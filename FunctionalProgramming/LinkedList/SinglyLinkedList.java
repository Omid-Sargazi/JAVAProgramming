package FunctionalProgramming.LinkedList;

public class SinglyLinkedList implements LinkedList {
    private Node head;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }
}
