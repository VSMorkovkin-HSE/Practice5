package com.company;

import java.util.Iterator;
import java.util.Map;

public class MapIterator {
    private Iterator it;

    MapIterator(Map map) {
        it = map.entrySet().iterator();
    }

    public Object next() {
        return it.next();
    }

    public boolean hasNext() {
        return it.hasNext();
    }

    public void remove() {
        it.remove();
    }
}
