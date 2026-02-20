import org.example.IPersonService;
import org.example.Person;
import org.example.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {


    Person person;

    @BeforeEach
    void setup(){
        person = new Person(
                1L,
                "Felix",
                "Mavila",
                "Male",
                "felixmacarenco@gmail.com",
                "praca Luis de Canoes N8 6300-725"
        );
    }

    @DisplayName( "When create a Person with success Should Return a Person object")
    @Test
    void testCreatePersonWithSuccessShouldReturnPersonObject(){
        //Given
        IPersonService service = new PersonService();

        //When
        Person actual = service.createPerson(person);

        //Then
        Assertions.assertNotNull(actual,() -> "CreatePerson() should not have returned a null");
    }

    @DisplayName( "When create a Person with success Should Contains a firstname in return Person object")
    @Test
    void testCreatePersonWithSuccessShouldContainsFirstNameInReturnPersonObject(){
        //Given
        IPersonService service = new PersonService();

        //When
        Person actual = service.createPerson(person);

        //Then
        Assertions.assertEquals(person.getFirstname(),actual.getFirstname(),() -> "The firstname is different");
    }

    @DisplayName("When create a Person with sucess Should Contains lastname in return Person Object")
    @Test
    void testCreatePersonWithSuccessShouldContainsLastNameInReturnPersonObject(){
        //Given
        IPersonService service = new PersonService();

        //When
        Person actual = service.createPerson(person);

        //Then
        Assertions.assertEquals(person.getLastName(),actual.getLastName(),() -> "The lastname is different");
        Assertions.assertNotNull(actual);
    }

    @DisplayName("When create a Person with sucess Should Contains email in return Person Object")
    @Test
    void testCreatePersonWithSucessShouldContainsEmailInResturnObject(){
        //Given
        IPersonService service = new PersonService();

        //When
        Person actual = service.createPerson(person);

        //Then
        Assertions.assertEquals(person.getEmail(),actual.getEmail(),() -> "The email is different");
    }

    @DisplayName("When create a Person with sucess Should Contains Gender in return Person Object")
    @Test
    void testCreatePersonWithSucessShouldContainsGenderInResturnObject(){
        //Given
        IPersonService service = new PersonService();

        //When
        Person actual = service.createPerson(person);

        //Then
        Assertions.assertEquals(person.getGender(),actual.getGender(),() -> "The gender is different");
    }

    @DisplayName("When create a Person with sucess Should Contains address in return Person Object")
    @Test
    void testCreatePersonWithSucessShouldContainsAddressInResturnObject(){
        //Given
        IPersonService service = new PersonService();

        //When
        Person actual = service.createPerson(person);

        //Then
        Assertions.assertEquals(person.getAddress(),actual.getAddress(),() -> "The Address is different");
    }


}
