import org.example.SimpleMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

public class SimpleMathTests {

    SimpleMath math;

    @BeforeAll
    static void setup(){
        System.out.println("Before all tests");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("After all tests");
    }

    @BeforeEach
    void beforeEachMethod(){
       math = new SimpleMath();
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println("After each test");
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoAndTwo_ShouldReturnEightDotTwo(){

        //usando o BDD style ----> Given, When, Then , Behavior Driven Development

        //Given

        double firstnumber = 6.2D, secondnumber = 2D;

        //When
         Double result = math.sum(firstnumber,secondnumber);

         //Then
        Assertions.assertEquals(8.2D,result);
        Assertions.assertNotEquals(8.3D,result);
        Assertions.assertNotNull(result);
    }

    @Test
    void testSubstract(){

        double firstNumber = 5.5D,secondNumber = 5.5;
        Double result = math.substract(firstNumber,secondNumber);
        Assertions.assertEquals(0D,result);
        Assertions.assertNotEquals(0.1D,result);
        Assertions.assertNotNull(result);
    }

    @Test
    void testMultiply(){

        double firstNumber = 5.5D,secondNumber = 5.5;
        Double result = math.multiply(firstNumber,secondNumber);
        Assertions.assertEquals(30.25D,result);
        Assertions.assertNotEquals(31.26D,result);
        Assertions.assertNotNull(result);
    }

    @Test
    void testDivide(){

        double firstNumber = 5.5D,secondNumber = 5.5;
        Double result = math.divide(firstNumber,secondNumber);
        Assertions.assertEquals(1D,result);
        Assertions.assertNotEquals(1.1D,result);
        Assertions.assertNotNull(result);
    }

    @Test
    void testAverage(){

        double firstNumber = 5.5D,secondNumber = 5.5;
        Double result = math.average(firstNumber,secondNumber);
        Assertions.assertEquals(5.5D,result);
        Assertions.assertNotEquals(5.6D,result);
        Assertions.assertNotNull(result);
    }

    @Test
    void testSquare(){

        double number = 3D;
        Double result = math.square(number);
        Assertions.assertEquals(9D,result);
        Assertions.assertNotEquals(90,result);
        Assertions.assertNotNull(result);
    }

    @Test
    void testDivision_When_fisrtNumberIsDividedByZero_ShouldThrownArithmeticException(){

        double firstNumber = 10D,secondNumber = 0D;
        Assertions.assertThrows(ArithmeticException.class,()->math.divide(firstNumber,secondNumber));
    }
}
