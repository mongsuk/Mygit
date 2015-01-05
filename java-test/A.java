package com.example.test;

import test.com.example.B.B;

public class A {
    public static void main(String[] args) {
        B test = new B();

        test.setEventListener(new C());
    /*
        test.setEventListener(new B.EventListener( ) {
                public void Event( B test ) {
                    System.out.println("Occured Event");
		}});
                */
        test.run();
    }
}
