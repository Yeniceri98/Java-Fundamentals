package sections.sec72_SOLID;

/*
    BAD IMPLEMENTATION:

    class UserService {
        public void createUser(String username) {
            System.out.println("User created: " + username);
        }

        public void saveToDatabase(String username) {
            System.out.println("Saved to DB: " + username);
        }

        public void sendEmail(String username) {
            System.out.println("Email sent to: " + username);
        }
    }
*/

class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void createUser(String username) {
        userRepository.save(username);
        emailService.send(username);
    }
}

class UserRepository {
    public void save(String username) {
        System.out.println("Saved to DB: " + username);
    }
}

class EmailService {
    public void send(String username) {
        System.out.println("Email sent to: " + username);
    }
}

public class SingleResponsibility {
    public static void main(String[] args) {
        UserService userService = new UserService(new UserRepository(), new EmailService());
        userService.createUser("john");
    }
}

// Bir class’ın tek bir değişme sebebi olmalıdır. Yani class tek bir sorumluluk taşımalıdır
