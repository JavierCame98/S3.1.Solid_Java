package S;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingleResponsibilityPrincipleTest {
    private EmailValidation validator;
    private EmailConfirmation confirmation;
    private User validUser;

    @BeforeEach
    void setUp() {
        validator = new EmailValidation();
        confirmation = new EmailConfirmation();
        validUser = new User("Javi", "javi@gmail.com", "ABC12345");
    }

    @Test
    void testValidUser() {
        assertDoesNotThrow(() -> validator.validation(validUser));
    }

    @Test
    void testInvalidEmail() {
        User badEmail = new User("Javi", "javigmailcom", "ABC12345");
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                    validator.validation(badEmail));
        assertEquals("Invalid email address.", exception.getMessage());
    }

    @Test
    void testWeakPassword() {
        User weakPass = new User("Javi", "javi@gmail.com", "abc");
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                    validator.validation(weakPass));
        assertTrue(exception.getMessage().contains("Password must be at least 8 characters long"));
    }

    @Test
    void testSendEmail() {
            assertDoesNotThrow(() -> confirmation.sendEmail(validUser));
    }

    @Test
    void testExceptionType() {
            UserNotConfirmed exception = new UserNotConfirmed("Error de prueba");
            assertNotNull(exception);
    }
}
