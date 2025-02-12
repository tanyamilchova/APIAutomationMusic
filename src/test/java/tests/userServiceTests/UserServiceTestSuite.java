package tests.userServiceTests;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@Suite
@SelectClasses({
        CreateUserTest.class,
        DeleteUserTest.class,
        GetUserByIdTest.class
})
public class UserServiceTestSuite {
}

