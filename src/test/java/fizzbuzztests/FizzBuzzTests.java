package fizzbuzztests;

import com.sparta.ec.FizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class FizzBuzzTests {

    @Test
    @DisplayName("Given one, return one as a String")
    public void givenOne_fizzBuzz_returnsOneAsString() {
        Assertions.assertEquals("1", FizzBuzz.fizzBuzz(1));
    }
    
    @ParameterizedTest
    @DisplayName("Given an integer, fizzBuzz returns num as a string")
    @CsvSource({"1, 1",
                "2, 2"})
    public void givenAnyInteger_fizzBuzz_returnsNumAsString(String expected, int input) {
        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(input));
        
    }

    //givenThree_Return_Fizz()

    @Test
    @DisplayName("Given input three should return 'Fizz'")
    public void givenThree_Return_Fizz() {
        int input = 3;
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(input));
    }

    //givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input)
    @ParameterizedTest
    @CsvSource({"3,Fizz","12, Fizz"}) // 2 or more.. In this case One input, one expected
    @DisplayName("given A Number Divisible By Three But Not Five should return 'Fizz' ")
    public void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input, String expected) {

        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }


    // givenFive_Return_Buzz()
    @Test
    @DisplayName("Given 5, return 'Buzz'")
    public void givenFive_Return_Buzz() {
        int input = 5;
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz(input));
    }

    // givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input)
    @ParameterizedTest
    @CsvSource({"20,Buzz","25, Buzz"})
    @DisplayName("Given a number divisible by 5 but not 3 return Buzz")
    public void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input,String expected) {
        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }

    // givenFifteen_Return_FizzBuzz()
    @Test
    @DisplayName("Given fifteen, return 'Buzz'")
    public void given_fifteen_Return_Buzz() {
        int input = 15;
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(input));
    }

    // givenANumberDivisibleByFifteen_Return_FizzBuzz(int input)

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    @DisplayName("given A Number Divisible By Fifteen return 'FizzBuzz'")
    public void givenANumberDivisibleByFifteen(int input) {

        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(input));
    }

}



