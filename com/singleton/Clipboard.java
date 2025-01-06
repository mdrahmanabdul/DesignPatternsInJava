package com.singleton;


public class Clipboard {
    public String value;

    public void copy(String value){
        this.value=value;
    }

    public String paste(){
        return  value;
    }

    public static void main(String[] args) {
        Clipboard c1 = new Clipboard();
        Clipboard c2 = new Clipboard();

        c1.copy("Process 1");
        c2.copy("Process 2");

        System.out.println(c1.paste());
        System.out.println(c2.paste());
    }
}
