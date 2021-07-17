import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordTest {

    @Test
    @DisplayName("should return true when given correct password")
    public void checkWithCorrectPassword() {
        // Given
        String testPassword = "QWE123cvb&%$";

        // When
        boolean actual = Password.validate(testPassword);

        // Then
        assertTrue(actual);
    }

    @Test
    @DisplayName("should return false when given password too short")
    public void checkForMinimalLength() {
        // Given
        String testPassword = "E3c&%";

        // When
        boolean actual = Password.validate(testPassword);

        // Then
        assertFalse(actual);
    }

    @Test
    @DisplayName("should return false when given password without capital Letters")
    public void checkWithoutCapitalLetters() {
        // Given
        String testPassword = "qwe123cvb&%$";

        // When
        boolean actual = Password.validate(testPassword);

        // Then
        assertFalse(actual);
    }

    @Test
    @DisplayName("should return false when given password without lower case Letters")
    public void checkWithoutLowerCaseLetters() {
        // Given
        String testPassword = "123QWEVSSDF&%$";

        // When
        boolean actual = Password.validate(testPassword);

        // Then
        assertFalse(actual);
    }

    @Test
    @DisplayName("should return false when given password without numbers")
    public void checkWithoutNumbers() {
        // Given
        String testPassword = "werdcQWEVadf&%$";

        // When
        boolean actual = Password.validate(testPassword);

        // Then
        assertFalse(actual);
    }

    @Test
    @DisplayName("should return false when given password without special characters")
    public void checkWithoutSpecialCharacters() {
        // Given
        String testPassword = "werdcQWEVadf3242";

        // When
        boolean actual = Password.validate(testPassword);

        // Then
        assertFalse(actual);
    }



}