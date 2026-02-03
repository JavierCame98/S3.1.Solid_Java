package S;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        User Javi = new User("Javi", "javi@gmail.com", "ABC123");

        EmailValidation emailValidation = new EmailValidation();
        EmailConfirmation emailConfirmation = new EmailConfirmation();

        emailValidation.validation(Javi);
        emailConfirmation.sendEmail(Javi);

    }
}
