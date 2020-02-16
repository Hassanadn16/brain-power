package com.company;
import java.io.*;
public class tryin {
    public static void main(String[] args) {
        try {
        int[] arays={20,20,40,44,10,20,10,32};
        FileWriter myfile=new FileWriter("file.txt");
        int num=0;
        for (int i:arays) {
            if (i <= 20) {
                num++;
                String str1=Integer.toString(num),str2=Integer.toString(i);
                myfile.write(str1 + "" + str2);
                myfile.close();
                System.out.println(i);
                System.out.printf("accepted number is : %d\n", num);
            } else
                System.out.println("greater than 20");
        }
        }
            catch (IOException e ){
                System.out.println("error");
                e.printStackTrace();
            }
        }
        }

