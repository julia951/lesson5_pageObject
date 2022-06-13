package tests;

import org.junit.jupiter.api.Test;

public class TestFormTests extends TestBase {

    @Test
    void successfullTest() {

        String firstName = "Julka";
        String lastName = "Pulka";
        String email= "tester@gmail.tests.test";
        String phoneNumber= "1234567890";
        String gender= "Female";
        String month= "October";
        String year= "2000";
        String day= "12";
        String subjectMath= "Maths";
        String hobbyReading= "Reading";
        String address= "testCity testStreet 123";
        String picture ="./img/1.png";
        String file ="src/test/resources/1.png";
        String state= "Haryana";
        String city= "Panipat";
        String successModalWindow= "Thanks for submitting the form";

        registrationPage.openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmailAddress(email)
                .chooseFemaleGender()
                .typePhoneNumber(phoneNumber)
                .setDateOfBirth(day, month, year)
                .chooseSubject(subjectMath)
                .chooseHobby(hobbyReading)
                .uploadPicture(file)
                .typeCurrentAddress(address)
                .chooseState(state)
                .chooseCity(city)
                .submitForm()
                .checkFormOpened(successModalWindow)
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", "Female")
                .checkResult("Mobile", phoneNumber)
                .checkResult("Date of Birth", day+" " + month +"," + year)
                .checkResult("Subjects", subjectMath)
                .checkResult("Hobbies", hobbyReading)
                .checkResult("Picture", "1.png")
                .checkResult("Address", address)
                .checkResult("State and City", state + " " + city);
    }
}
