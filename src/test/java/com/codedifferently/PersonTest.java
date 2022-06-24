package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Constructor Test")
    public void ConstructorTest(){
        Person person = new Person("Jacoby", "Jones", "4432456778");
        String expected = "Jacoby Jones 4432456778" ;
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String phoneNumber = person.getPhoneNumber();
        String actual = person.toString();
        Assertions.assertEquals(actual,expected);
    }
}
