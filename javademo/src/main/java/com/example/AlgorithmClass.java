package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.ס��������
 * 2.�ٿ�
 * 3.2016/11/23
 */
public class AlgorithmClass {

    private static String s;

    public static void main(String[] args) {
        try {
            //����̨����
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("�����˰ǰ����:");
            //����˰ǰ����
            s=strin.readLine();
            //�������Stringֵǿת��int����
            int k=Integer.parseInt(s);
            //�����Լ�ÿ��Ҫ����ס��������
            int p=k/10*2/2;
            //�����ܵ�ס��������
            System.out.println("����ס��������Ϊ"+k/10*2);
            System.out.println("��ÿ��Ҫ����ס��������Ϊ:"+p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
