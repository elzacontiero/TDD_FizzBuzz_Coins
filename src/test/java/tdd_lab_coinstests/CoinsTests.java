package tdd_lab_coinstests;

import com.sparta.ec.tdd_lab_coins.Coins;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

public class CoinsTests {

    @Test
    @DisplayName("Simple test for 1 pence")
    public void simpleTestFor1Pence(){
        int pence = 1;
        String result = Coins.returnCoins(pence);
        Assertions.assertEquals("2£:0;1£:0;50p:0;20p:0;10p:0;5p:0;2p:0;1p:1",result);
    }

    // give parameters to your test, given an amount in pence, get back the result.
    @ParameterizedTest
    @CsvSource({
            "2,2£:0;1£:0;50p:0;20p:0;10p:0;5p:0;2p:1;1p:0",
            "5,2£:0;1£:0;50p:0;20p:0;10p:0;5p:1;2p:0;1p:0",
            "10,2£:0;1£:0;50p:0;20p:0;10p:1;5p:0;2p:0;1p:0",
            "20,2£:0;1£:0;50p:0;20p:1;10p:0;5p:0;2p:0;1p:0",
            "50,2£:0;1£:0;50p:1;20p:0;10p:0;5p:0;2p:0;1p:0",
            "100,2£:0;1£:1;50p:0;20p:0;10p:0;5p:0;2p:0;1p:0",
            "200,2£:1;1£:0;50p:0;20p:0;10p:0;5p:0;2p:0;1p:0",
            "300,2£:1;1£:1;50p:0;20p:0;10p:0;5p:0;2p:0;1p:0",
            "345,2£:1;1£:1;50p:0;20p:2;10p:0;5p:1;2p:0;1p:0",
            "400,2£:2;1£:0;50p:0;20p:0;10p:0;5p:0;2p:0;1p:0",
            "500,2£:2;1£:1;50p:0;20p:0;10p:0;5p:0;2p:0;1p:0"
    })

    // expectedResult is given by the parameter (2p:1)
    @DisplayName("given an amount of pences expect a result.")
    public void testPencesToResult(int pence,String expectedResult){
        String result = Coins.returnCoins(pence);
        Assertions.assertEquals(expectedResult,result);

    }
}
