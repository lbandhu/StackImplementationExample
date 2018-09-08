package com.lokesh.javalab;

public class Main {

    public static void main(String[] args) {
	// write your code here


        SimpleStack theStack = new SimpleStack(3);

        theStack.push("a");
        theStack.push("b");
        theStack.push("c");


        theStack.display();

        theStack.pop();

        System.out.println("Display After pop");

        theStack.display();


    }
}
