package com.codedifferently;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.codedifferently.Person;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;


public class PhoneBookTest {


    @Test
    @DisplayName("Find Person Test")
    public void findPersonTest(){
        Person person = new Person("Jacoby", "Jones", "4432456778");
        Person Jake = new Person("Jake", "Jones", "4432334328");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPersonToPhoneBook(person);
        Assertions.assertNotNull(phoneBook);

    }
    @Test
    @DisplayName("Get Number of People Test")
    public void AddNumberOfPeople(){
        Person person = new Person("Jacoby", "Jones", "4432456778");
        PhoneBook phoneBook = new PhoneBook();
        Integer expected = 1;
        phoneBook.addPersonToPhoneBook(person);
        Integer actual = phoneBook.getNumberOfPeople();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Find Person by Name")
    public void FindPersonByName() throws PersonNotFoundException{
        Person person = new Person("Jacoby", "Jones", "4432456778");
        PhoneBook phonebook = new PhoneBook();
        phonebook.addPersonToPhoneBook(person);

        Person person1 = phonebook.findPersonByName("Jacoby", "Jones");
        Assertions.assertEquals(person,person1);
    }

    @Test
    @DisplayName("Find Person Test Fail")
    public void FindPersonTestFail() {

        Assertions.assertThrows(PersonNotFoundException.class, () ->{;
        PhoneBook phonebook = new PhoneBook();
        phonebook.findPersonByName("A", "B");
    });
    }



}
