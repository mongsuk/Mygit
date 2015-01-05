package com.example.test;

import test.com.example.B.B;

class C implements B.EventListener {
    
    public void Event(B test) {
        System.out.println("Occured Event");
    }
}
