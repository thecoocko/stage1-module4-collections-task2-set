package com.epam.mjc.collections.set;

import java.io.FileReader;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;


public class SubsetOfSquaresCreator {
    private static final Logger logger = Logger.getLogger(FileReader.class.getName());
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> set = new TreeSet<>();
        try {
            for(int i : sourceList){
                set.add((int) Math.pow(i,2));
            }
        }
        catch (Exception e){
            logger.severe(e.getMessage());
        }
        return set.subSet(lowerBound,upperBound+1);
    }
}
