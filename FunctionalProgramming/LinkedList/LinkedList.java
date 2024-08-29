package FunctionalProgramming.LinkedList;

public interface LinkedList {
    void insertFirst(int data);

    void insertLast(int data);

    void insertAt(int index, int data);

    int deleteFirst();

    int deleteLast();

    int deleteAt(int index);

    int popFirst();

    int popLast();

    int popAt(int index);

    int search(int data);

    int size();

    void clear();

}
