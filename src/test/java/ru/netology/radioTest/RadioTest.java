package ru.netology.radioTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        short expected;
        assertEquals( 9, radio.getCurrentStation());
    }
}
