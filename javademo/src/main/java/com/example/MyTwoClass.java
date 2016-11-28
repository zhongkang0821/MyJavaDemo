package com.example;

/**
 * 1.调用MyClass中的静态常量，写一个非静态方法让MyClass实现静态调用非静态
 * 2.仲康
 * 3.2016/11/23
 */
public class MyTwoClass {



    public static void main(String[] args) {
        MyClass cc=new MyClass();
        System.out.println(cc.str+"aaaaaaaa");

    }

    public void NonStaticMethod(){
        System.out.println("your is sijinyuan");
    }

}
