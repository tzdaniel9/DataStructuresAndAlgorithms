package com.stacks;

public class linkedStackM {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike","Wilson",78);
        Employee bilEnd = new Employee("Bill", "End", 78);


        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(bilEnd);

//        stack.printStack();

//        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println("Popped:" + stack.pop());
        System.out.println(stack.peek());

    }
}
