package com.epam.mjc.collections.set;

import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class SetCombinationCreator {
    private static final Logger logger = Logger.getLogger(FileReader.class.getName());
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new TreeSet<>();
        try{
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        firstSet.retainAll(secondSet);
        set.addAll(firstSet);
        set.addAll(thirdSet);
        }
        catch (Exception e){
            logger.severe(e.getMessage());
        }
        return set;
    }
}
