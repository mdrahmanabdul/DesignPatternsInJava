package com.singleton;

public class ClipboardAdvanced {

    private String value;

    private static ClipboardAdvanced ClipboardAdvanced = null;

    private  ClipboardAdvanced(){}

    public static  ClipboardAdvanced getInstance(){
        if(ClipboardAdvanced == null){
            ClipboardAdvanced = new ClipboardAdvanced();
        }
        return ClipboardAdvanced;
    }

    public void copy(String value){
        this.value=value;
    }

    public String paste(){
        return value;
    }

    public static void main(String[] args) {

        ClipboardAdvanced c1 = getInstance();
        ClipboardAdvanced c2 = getInstance();

        c1.copy("Process 1");
        c2.copy("Process 2");

        System.out.println(c1.paste());
        System.out.println(c2.paste());

    }
}
