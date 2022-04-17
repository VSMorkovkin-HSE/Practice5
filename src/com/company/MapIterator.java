package com.company;

import java.util.Iterator;
import java.util.Map;

public class MapIterator<T> {
    private Iterator<T> it;

    MapIterator(Map map) {
        it = map.entrySet().iterator();
    }

    public T next() {
        return it.next();
    }

    public boolean hasNext() {
        return it.hasNext();
    }

    public void remove() {
        it.remove();
    }
}
