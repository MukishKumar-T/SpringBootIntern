package org.example;

public class Calculator {

//    public Calculator(){
//        System.out.println("Calculator invoked");
//    }

    public int add(int a,int b){
//        int addition = a+b;
        return a + b;
    }
    public int sub(int a,int b){
//        int subtraction = a-b;
        return a - b;
    }
    public int mul(int a,int b){
//        int multiplicate = a*b;
        return a * b;
    }
    public int div(int a,int b){
        if(b==0) return 0;
//        int division = a/b;
        return a / b;
    }
}
