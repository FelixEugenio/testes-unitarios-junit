import org.example.SimpleMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SimpleMathTestsS3 {

    SimpleMath math;

    @BeforeAll
    static void setup(){
        System.out.println("Before all tests");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("After all tests");
    }

    public static Stream<Arguments> TestDivisionInputParameters() {
        return Stream.of(
                Arguments.of(10D,2D,5D),
                Arguments.of(10D,2D,Double.NaN)
        );
    }

    @BeforeEach
    void beforeEachMethod(){
        math = new SimpleMath();
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println("After each test");
    }

    @ParameterizedTest
    @MethodSource("TestDivisionInputParameters")
    void testDivide(double firstnumber,double secondnumber,double expectedResult){

        Double result = math.divide(firstnumber,secondnumber);
        Assertions.assertEquals(5D,result);
        Assertions.assertNotEquals(1.1D,result);
        Assertions.assertNotNull(result);
    }


}
