

import org.junit.Assert;
import org.junit.Test;



public class FizzBuzzGeneratorTest {

    @Test
    public void divisibleby() {
     Assert.assertTrue(FizzBuzzGenerator.divisibleBy(4,2) );
     Assert.assertFalse(FizzBuzzGenerator.divisibleBy(3,2) );
     Assert.assertTrue(FizzBuzzGenerator.divisibleBy(15,3) );
     Assert.assertTrue(FizzBuzzGenerator.divisibleBy(20,5) );
    }


    @Test
    public void fizzBuzz() {

        FizzBuzzGenerator n = new FizzBuzzGenerator();
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, n.FizzBuzz(1, 16).toArray());
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz"}, n.FizzBuzz(1, 34).toArray());

    }

}