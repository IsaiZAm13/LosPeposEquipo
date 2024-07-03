// Clase User
public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

// Clase EmailService
public class EmailService {
    public void sendEmail(User user, String subject, String message) {
        String emailAddress = user.getEmail();
        System.out.println("Sending email to " + emailAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }
}

// Clase Main para usar las clases anteriores
public class Main {
    public static void main(String[] args) {
        User user = new User("johndoe", "johndoe@example.com");
        EmailService emailService = new EmailService();

        emailService.sendEmail(user, "Welcome!", "Thank you for registering, John Doe!");
    }
}
