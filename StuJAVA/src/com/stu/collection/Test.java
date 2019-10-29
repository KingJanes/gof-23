package com.stu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test
{
    public static void main(String [] args){

        Collection coll = new ArrayList();
//        System.out.printlnntln(coll);
//        new DemoCollection().show(coll);
//        System.out.println(coll);
          new IteratorDemo().iteratorDemo(coll);
   }
}
