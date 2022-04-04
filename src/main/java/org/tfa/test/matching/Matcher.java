package org.tfa.test.matching;

import java.util.*;
import java.util.stream.Collectors;

public class Matcher {

    /*
     * This is the placeholder method to be built out as part of the coding exercise
     */
    public String getBestMatch(String state,String color,String field,String gender) {
        DataLoader dl = new DataLoader();
        ArrayList<DataLoader.Person> data = dl.getData();
        int max = 0;
        DataLoader.Person bestMatch = null;
        for (DataLoader.Person person : data) {
            int match = 0;
            if (person.color.equalsIgnoreCase(color)) match++;
            if (person.gender.equalsIgnoreCase(gender)) match++;
            if (person.state.equalsIgnoreCase(state)) match++;
            if (person.field.equalsIgnoreCase(field)) match++;

            if(match>max||max==0){
                bestMatch = person;
                max = match;
            }
        }

        // this will need to change to return a value
        return "ID = "+ bestMatch.id+" Score = "+max;
    }

    public static void main(String[] args) {
       Matcher matcher = new Matcher();
       String res = matcher.getBestMatch("NY","Blue","Advertising","Male");
        System.out.println(res);
    }
}
