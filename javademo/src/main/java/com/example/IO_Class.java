package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 1.IO��
 * 2.�ٿ�
 * 3.2016/11/23
 */
public class IO_Class {
    public static void main(String[] args) {

        //�ļ����
        String name="�����޵д���!!!";
        File file=new File("E:/kk//tt.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(name.getBytes());
            fos.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        //�ļ�����
        try {
            int b;
            FileInputStream readfile=new FileInputStream("E://tset.txt");
            byte buffer[] = new byte[2500];
            b=readfile.read(buffer,0,2000);
            String str=new String(buffer,0,b,"Default");
            System.out.println(str);
            System.out.println(b);
            readfile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
