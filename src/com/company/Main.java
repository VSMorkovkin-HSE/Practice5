package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Python");

        for(Iterator it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry)it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key = " + key + "  value = " + value);
        }

        for (MapIterator it = new MapIterator(map); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry)it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key = " + key + "  value = " + value);
        }
    }
}
