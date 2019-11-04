package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author 周争争
 * @date 2019/11/4-9:59
 */
public class TemplatesTest {
    /**
    *客户
    */
    private int id;
    /**
    *姓名
    */
    private String name;
    
    
    
    
    //模板六：prsf
    private static final int I=0;
    //变形:psf
    public static final int T=1;
    //变形:psfi
    public static final int C=0;
    //变形:psfs
    public static final String NATION="China";


    //模板一
    public static void main(String[] args) {
        //模板二
        System.out.println("hello!");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        //模板三
        String[] arr=new String[]{"a","b","c"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四:list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        }
        public void  metnod(){
            System.out.println("TemplatesTest.metnod");
            ArrayList list=new ArrayList();
            list.add(123);
            list.add(456);
            list.add(789);
            //模板五ifn
            if (list == null) {

            }
            //变形：inn
            if (list != null) {
                
            }
            //变形：xxx.nn/xxx.null
            if (list == null) {

            }
            if (list != null) {

            }




        }
        public void test(){
        
        }
}
