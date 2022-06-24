package com.codedifferently;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Person> people;

    public PhoneBook() {
        people = new ArrayList<>();
    }
    public Integer getNumberOfPeople(){
        return people.size();
    }

    public void addPersonToPhoneBook(Person person){
        this.people.add(person);

    }
    public Person findPersonByName (String firstName, String lastName) throws PersonNotFoundException {

        for (Person person : people) {
            if (people.contains(person.getFirstName()) && (people.contains(person.getLastName()))) {
                return person;
            }
        }


        String error = String.format("Person %s %s was not found" , firstName,lastName);
        throw new PersonNotFoundException(error);
    }

}