package org.tfa.test.matching;

import java.util.ArrayList;
import java.util.HashMap;

public class DataLoader {

    public class Person {

        public String id;
        public String name;
        public String color;
        public String gender;
        public String state;
        public String field;
    }

    public ArrayList<Person> getData() {

        ArrayList people = new ArrayList();

        Person peter = new Person();
        peter.id = "1";
        peter.name = "Peter";
        peter.color = "Blue";
        peter.gender = "Male";
        peter.state = "NY";
        peter.field = "Advertising";
        people.add(peter);

        Person steve = new Person();
        steve.id = "2";
        steve.name = "Steve";
        steve.color = "Red";
        steve.gender = "Male";
        steve.state = "NY";
        steve.field = "Medicine";
        people.add(steve);

        Person jane = new Person();
        jane.id = "3";
        jane.name = "Jane";
        jane.color = "Blue";
        jane.gender = "Female";
        jane.state = "NJ";
        jane.field = "Advertising";
        people.add(jane);

        Person ann = new Person();
        ann.name = "Ann";
        ann.color = "Purple";
        ann.gender = "Female";
        ann.state = "NC";
        ann.field = "Psychology";
        people.add(ann);

        return people;
    }
}
