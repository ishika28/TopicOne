package com.example.topicone;

public class Operationclass {

    int number1,number2;

    public Operationclass(int a,int b){
        this.number1=a;
        this.number2=b;
    }

    public   int add(){

        return  number1+number2;
    }

    public  int mul(){
        return number1*number2;
    }

    public  int div(){
        return number1/number2;
    }

    public  int sub(){
        return number1-number2;
    }

}
