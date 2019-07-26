package com.atguigu.java;

import java.util.ArrayList;

/**
 * @auther ocean li
 * @date 2019/7/25 - 16:05
 * 模版
 */
public class hello  {
    //模版6
    private static final int aaa=10;

    //模版1 psvm
    public static void main(String[] args) {
        //模版2 sout
        int num = 1;
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("hello.main");
        
        //模版3 for
       /* for (int i = 0; i < num ; i++) {
            
        }*/
       //iter
        for (String arg : args) {

        }
        //itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }
        //模版4list.for
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("111");
        objects.add("222");
        objects.add("333");

        for (Object object : objects) {

        }


        //模版6 全局变量psf


    }

    //模版5
    public void method(){


        ArrayList<Object> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
    }



    //模版3




}

