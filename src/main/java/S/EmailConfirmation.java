package S;

public class EmailConfirmation {

    public void sendEmail(User user) throws UserNotConfirmed {

        System.out.println("📧 Sending confirmation email to: " + user.email());

        boolean userConfirmed = true;
        if (!userConfirmed) {
            throw new UserNotConfirmed ("⚠️ User did not confirm registration.");
        }

    }

}
