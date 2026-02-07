package sections.sec73_unit_test.b_with_dependency_junit_and_mockito;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(Long id) {
        return userRepository.findById(id)
                .map(User::getName)
                .orElseThrow(() -> new UserNotFoundException("User not found: " + id));
    }
}
