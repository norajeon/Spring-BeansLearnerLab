package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }
    

    public People(PersonType... people) {
        Arrays.asList(people);
    }

    public void add(PersonType person) {
        personList.add(person);
    } 

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size(List<PersonType> list) {
        return list.size();
    }

    public void clear(List<PersonType> list) {
        list.clear();
    }

    public void addAll(Iterable<PersonType> people) {
        for (PersonType a : people) {
            add(a);
        }
    }

    public PersonType findById(long id) {
        for (PersonType a : personList) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }



    
}
