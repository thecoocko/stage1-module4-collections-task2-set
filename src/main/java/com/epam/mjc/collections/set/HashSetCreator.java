package com.epam.mjc.collections.set;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;


public class HashSetCreator {
    private static final Logger logger = Logger.getLogger(FileReader.class.getName());
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        try{
            for (int x : sourceList) {
                if (x % 2 == 0) {
                    while (x % 2 == 0) {
                        hashSet.add(x);
                        x /= 2;
                    }
                    hashSet.add(x);
                } else {
                    hashSet.add(x);
                    hashSet.add(2 * x);
                }
            }

        }catch (Exception e){
            logger.severe(e.getMessage());
        }

        return hashSet;
    }
}
