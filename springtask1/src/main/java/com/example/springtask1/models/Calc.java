package com.example.springtask1.models;

public class Calc implements Calculator {
    private int a;
    private String action;
    private int b;

    public Calc() {
    }

    public Calc(int a, String action, int b) {
        this.a = a;
        this.action = action;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }



    @Override
    public String calculate() {
        
         System.out.println(action);

        if( action.equals("sum") ) {
            System.out.println( b);
            System.out.println( a);
        }
        return action;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "a=" + a +
                ", action='" + action + '\'' +
                ", b=" + b +
                '}';
    }

}
