package com.bridgelabz.UserReg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstname_WhenProper_ShouldReturnFirstNameisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validFirstName("Prakash");
        Assertions.assertEquals("First Name is Valid", actualresult);
    }

    @Test
    public void givenLastname_WhenProper_ShouldReturnLastNameisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validLastName("Udikeri");
        Assertions.assertEquals("Last Name is Valid", actualresult);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnEmailisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validEmail("prakash.udikeri@gmail.com");
        Assertions.assertEquals("Email is Valid", actualresult);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnPhoneNoisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validMobileNumber("91 9740753190");
        Assertions.assertEquals("Phone number is Valid", actualresult);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnPasswordisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validPassword("BridgeLabz2022");
        Assertions.assertEquals("Password is Valid", actualresult);
    }
}