package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.住房公积金
 * 2.仲康
 * 3.2016/11/23
 */
public class AlgorithmClass {

    private static String s;

    public static void main(String[] args) {
        try {
            //控制台输入
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请出入税前工资:");
            //输入税前工资
            s=strin.readLine();
            //把输入的String值强转成int类型
            int k=Integer.parseInt(s);
            //计算自己每月要交的住房公积金
            int p=k/10*2/2;
            //计算总的住房公积金
            System.out.println("您的住房公积金为"+k/10*2);
            System.out.println("您每月要交的住房公积金为:"+p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
