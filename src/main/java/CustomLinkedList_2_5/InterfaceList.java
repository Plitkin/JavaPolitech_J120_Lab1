package CustomLinkedList_2_5;

public interface InterfaceList {
    void addToFront(int data);
    int returnFront();
    int returnFrontAndRemove();
    void addToLast(int data);
    int returnLast();
    int returnLastAndRemove();
    boolean contains(int value);
    boolean isEmpty();
    void print();
    void removeValue(int data);

}