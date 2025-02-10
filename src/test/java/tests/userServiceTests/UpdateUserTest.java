package tests.userServiceTests;

import com.example.model.User;
import com.example.util.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.junit.jupiter.api.Test;
import service.UserService;

public class UpdateUserTest {
    private  UserService userService;

    private User user;
    @BeforeEach
    public void setup(){
        userService = new UserService();
        user = userService.createUser();
    }
    @AfterEach
    public void tearDown(){
        userService.deleteUserById(user.getId());
    }
    @Test
    public void updateUserDetailsTest(){
        long id = Util.getResourceToUpdate();
        userService.updateUserDetails(id);
    }
}
