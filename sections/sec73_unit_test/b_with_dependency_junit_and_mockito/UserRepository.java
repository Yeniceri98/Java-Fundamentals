package sections.sec73_unit_test.b_with_dependency_junit_and_mockito;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
}
