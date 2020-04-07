package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    private List<Person> people;

    public People(){
        people = new ArrayList<Person>();
    }

    public People(Person[] people){
        this();
        this.people.addAll(Arrays.asList(people));
    }

    public Boolean add(Person personToAdd){
        people.add(personToAdd);
        return true;
    }

    public Person findById(Long id){
        for (Person e : people) {
            if (e.getId().equals(id))
                return e;
        }
        throw new IndexOutOfBoundsException();
    }

    public Boolean contains(Person person){
        for(Person e : people) {
            if (e.equals(person))
                return true;
        }
        return false;
    }

    public Boolean remove(Person person){
        for(Person e : people) {
            if (e.equals(person)) {
                people.remove(e);
                return true;
            }
        }
        return false;
    }

    public Boolean remove(Long id){
        for(Person e : people) {
            if (e.getId().equals(id)) {
                people.remove(e);
                return true;
            }
        }
        return false;
    }

    public Boolean removeAll(){
        return people.removeAll(people);
    }

    public Boolean isEmpty(){
        return people.isEmpty();
    }

    public Integer count(){
        return people.size();
    }

    public Person[] toArray(){
        Person[] retArray = new Person[count()];
        for (int i = 0; i < count(); i++) {
            retArray[i] = people.get(i);
        }
        return retArray;
    }

    public Iterator<Person> iterator() {
        return people.iterator();
    }
}
