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

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void insertFirst(int data) {
        // TODO Auto-generated method stub
        Node newNode = new Node(data);
        newNode.next = head;
        size++;
        throw new UnsupportedOperationException("Unimplemented method 'insertFirst'");
    }

    @Override
    public void insertLast(int data) {
        // TODO Auto-generated method stub
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        throw new UnsupportedOperationException("Unimplemented method 'insertLast'");
    }

    @Override
    public void insertAt(int index, int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAt'");
    }

    @Override
    public int deleteFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFirst'");
    }

    @Override
    public int deleteLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteLast'");
    }

    @Override
    public int deleteAt(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAt'");
    }

    @Override
    public int popFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'popFirst'");
    }

    @Override
    public int popLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'popLast'");
    }

    @Override
    public int popAt(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'popAt'");
    }

    @Override
    public int search(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
}
