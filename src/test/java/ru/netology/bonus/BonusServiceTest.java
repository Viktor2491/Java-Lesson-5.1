package ru.netology.bonus;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvSource(
            value={
                    "'registered user, bonus under limit',1000,true,30",
                    "'registered user, bonus over limit',100000060,true,500"
            }
    )
    void shouldCalculate(String test, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
   // void shouldCalculateForRegisteredAndUnderLimit() {
       // BonusService service = new BonusService();

        // подготавливаем данные:
       // long amount = 1000;
        //boolean registered = true;
       // long expected = 30;

        // вызываем целевой метод:
       // long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
    //    assertEquals(expected, actual);
   // }

   // @org.junit.jupiter.api.Test
   // void shouldCalculateForRegisteredAndOverLimit() {
       // BonusService service = new BonusService();

        // подготавливаем данные:
       // long amount = 1_000_000;
     //   boolean registered = true;
       // long expected = 500;

        // вызываем целевой метод:
      //  long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
      //  assertEquals(expected, actual);
   // }

    @ParameterizedTest
    @CsvSource(
            value={
            "'unregistered user, bonus under limit',1000,false,10",
            "'unregistered user, bonus over limit',1000000,false,500"
    }
    )

    void shouldCalculateForUnregisteredAndOverLimit(String test, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // подготавливаем данные:
       // long amount = 1_000_000;
       // boolean registered = false;
        //long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

   // @org.junit.jupiter.api.Test
   // void shouldCalculateForUnregisteredAndUnderLimit() {
      //  BonusService service = new BonusService();
//
        // подготавливаем данные:
      //  long amount = 1_000;
       //boolean registered = false;
       // long expected = 10;

        // вызываем целевой метод:
       // long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
      //  assertEquals(expected, actual);

   // }
}