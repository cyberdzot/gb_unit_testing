package hw03;
//Задание 0. Доделать задания с семинара

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User my_account;
    UserRepository my_repository;

    @BeforeEach
    void initForTest() {
        my_account = new User("Vovqa", "123");
        my_repository = new UserRepository();
    }

    @ParameterizedTest
    @CsvSource({"Vovqa, 123"})
    void isUserAuthorized(String input_name, String input_pass) {
        assertTrue(my_account.authenticate(input_name, input_pass));
    }

    @ParameterizedTest
    @CsvSource({"Vovqa, 123"})
    void isUserInRepository(String input_name, String input_pass) {
        my_account.authenticate(input_name, input_pass);
        my_repository.addUser(my_account);
        assertTrue(my_repository.findByName(input_name));
    }
}
