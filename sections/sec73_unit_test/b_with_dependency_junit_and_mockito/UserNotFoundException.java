package sections.sec73_unit_test.b_with_dependency_junit_and_mockito;

public class UserNotFoundException extends RuntimeException {
    UserNotFoundException(String message) {
        super(message);
    }
}
