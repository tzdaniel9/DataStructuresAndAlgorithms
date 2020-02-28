package com.List;

public class IntegerLinkedList {

    /*
    private IntegerNode head;
    private int size;

    public  void addToFront(Employee employee){
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public  IntegerNode removeFromFront(){
        if(isEmpty()){
            return  null;
        }

        IntegeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void insertSorted(Integer value){

        //assumption: the list is sorted

        if (head == null || head.getValue() >= value){
            addToFront(value);
            return;
        }

        //find the insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        while (current != null && current.getValue() < value){
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);

        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public  void printList(){
        IntegerNode current = head;
        System.out.println("HEAD ->");
        while (current != null){
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
    */
}
