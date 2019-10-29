package com.stu.collection.stuMAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class StuMAP {

   Map<Integer,String> hm = new HashMap<Integer,String>();
    public void mapDemo(){
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4,"d");

        Set<Integer> keySet =  hm.keySet();
        for(Iterator<Integer> it = keySet.iterator(); it.hasNext();){
            System.out.println(hm.get(it.next()));
        }
    }

}
