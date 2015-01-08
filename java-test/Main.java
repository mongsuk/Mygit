package com.example.main;

import com.example.event.Event;

public class Main {
    public static void main(String[] args) {
        Event test = new Event();

    class Material implements Event.IEventListener {

        public void event() {
            System.out.println("Occured Event");
        }
    }
    test.setEventListener(new Material());

    test.run();
    }
}
