import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sections.sec73_unit_test.b_with_dependency_junit_and_mockito.User;
import sections.sec73_unit_test.b_with_dependency_junit_and_mockito.UserNotFoundException;
import sections.sec73_unit_test.b_with_dependency_junit_and_mockito.UserRepository;
import sections.sec73_unit_test.b_with_dependency_junit_and_mockito.UserService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void getUserName_whenUserExists_returnsName() {
        when(userRepository.findById(10L)).thenReturn(
                Optional.of(new User(10L, "Ahmet"))
        );

        String result = userService.getUserName(10L);

        assertEquals("Ahmet", result);
        verify(userRepository).findById(10L);
        verifyNoMoreInteractions(userRepository);
    }

    @Test
    void getUserName_whenUserMissing_throwsException() {
        when(userRepository.findById(99L)).thenReturn(Optional.empty());

        UserNotFoundException exception = assertThrows(
                UserNotFoundException.class,
                () -> userService.getUserName(99L)
        );

        assertEquals("User not found: 99", exception.getMessage());
        verify(userRepository).findById(99L);
    }
}
