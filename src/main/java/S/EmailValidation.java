package S;

public class EmailValidation {

    public void validation (User user){
        if (user.email() == null || !user.email().contains("@") || !user.email().contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        if (user.password() == null || user.password().length() < 8 || !user.password().matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
        }
    }
}
