package test.org.hbrs.s1.ws22.uebung1.control;

import org.hbrs.s1.ws22.uebung1.control.Translator;
import org.hbrs.s1.ws22.uebung1.control.TranslatorFactory;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @org.junit.jupiter.api.Test
    void translateNumber() {
        Translator translator = TranslatorFactory.createGermanTranslator();
        assertEquals("fünf", translator.translateNumber(5));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {translator.translateNumber(0);});
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {translator.translateNumber(-1);});
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {translator.translateNumber(11);});
    }
}