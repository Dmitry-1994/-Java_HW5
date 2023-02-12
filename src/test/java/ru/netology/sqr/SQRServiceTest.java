package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/range.csv")
    public void countSqrtInRange(int startRange, int endRange, int countInRange){
        SQRService calculate = new SQRService();
        int actual = calculate.countSqrtInRange(startRange, endRange);
        Assertions.assertEquals(countInRange, actual);

    }
}
