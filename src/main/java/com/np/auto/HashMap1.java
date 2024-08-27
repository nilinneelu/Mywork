package com.np.auto;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {

      HashMap<Integer,String> hashMap= new HashMap<>();

        hashMap.put(1,"Breakfast");
        hashMap.put(2,"Lunch");
        hashMap.put(3,"Dinner");

       System.out.println(hashMap.get(3));

       for(Integer i:hashMap.keySet())
     System.out.println("Key "+i+" Value " +hashMap.get(i));




    }
}
