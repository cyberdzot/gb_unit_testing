package hw03;
//Задание 0. Доделать задания с семинара

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User myAccount;
    UserRepository myRepository;

    @BeforeEach
    void initForTest() {
        myAccount = new User("Vovqa", "123");
        myRepository = new UserRepository();
    }

    @ParameterizedTest
    @CsvSource({"Vovqa, 123"})
    void isUserAuthorized(String inputName, String inputPass) {
        assertTrue(myAccount.authenticate(inputName, inputPass));
    }

    @ParameterizedTest
    @CsvSource({"Vovqa, 123"})
    void isUserInRepository(String inputName, String inputPass) {
        myAccount.authenticate(inputName, inputPass);
        myRepository.addUser(myAccount);
        assertTrue(myRepository.findByName(inputName));
    }
}
