package Calc;

public class Calculator {

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
//        this.add(a,b);
        return add(a,b) + c;
    }
}
