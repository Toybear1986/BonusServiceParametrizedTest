package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculate(String name, String name2, int amount, boolean registered, int expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual, name + " and " + name2 + " failed");
    }

}

