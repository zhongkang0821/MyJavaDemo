package com.example;

/**
 * 1.静态、动态、常量、变量
 * 2.仲康
 * 3.2016/11/23
 */

public class MyClass {

    static final String str="ssssssssssss";
    static String kkk="cccccc";
    String s="000";

    public static void main(String[] args) {

        //常量
        final String s="xxx";
        //调用其他类的非静态方法和变量
        MyTwoClass sObj=new MyTwoClass();
        sObj.NonStaticMethod();
        System.out.println(str);
        //调用类本身的非静态变量
        MyClass cl=new MyClass();
        System.out.println(s);
        //调用类本身的非静态方法
        cl.mm();

        dd();
        kk();
    }

    public static void kk(){
        //调用类本身的非静态变量
        MyClass c=new MyClass();
        System.out.println(c.s+".....");
    }

    private static void dd() {
        System.out.println("ddd"+kkk);
    }


    public void mm(){
        System.out.println("lllllll");
        //非静态调用静态
        System.out.println(str);
        s();
    }

    public static void s(){
        System.out.println("........");
    }

}
