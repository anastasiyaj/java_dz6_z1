package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({

            "200, 250, 1",
            "400, 500, 3",
            "401, 434, 0"
    })
    //@CsvFileSource (files = "src/test/resource/variables.csv")
    public void testMinMax(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }

}
