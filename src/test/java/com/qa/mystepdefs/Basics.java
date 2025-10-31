package com.qa.mystepdefs;

public class Basics extends overriding{
    void show() { System.out.println("Child"); }

    public static void main(String args[])   {
        Basics b = new Basics();
        b.show();
}
}
