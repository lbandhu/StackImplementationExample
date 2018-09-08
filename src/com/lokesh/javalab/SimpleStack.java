package com.lokesh.javalab;

public class SimpleStack {


    String[] data;
    int topOfStack;
    int sizeOfStack;


    SimpleStack(int size){

        topOfStack = -1;
        sizeOfStack = size;
        data = new String[size];

    }

    public void push(String newItem){

        if(topOfStack + 1 <= sizeOfStack){
            topOfStack ++;
            data[topOfStack] = newItem;

        }else{
            System.out.println("Stack Overflow");
        }

    }

    public String pop(){

        String tmp = null;

        if(sizeOfStack >= 0){

            data[topOfStack] = " "; //Replace deleted  item with empty string to mock like it's empty

            tmp =data[topOfStack--];

        }else{
            System.out.println("Stack is empty");
        }

        return tmp;
    }

    public void display(){
        for(String a : data){
            System.out.println(a);
        }
    }

}