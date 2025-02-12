package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import service.PlaylistService;
import service.UserService;

@Suite
@SelectClasses({UserService.class, PlaylistService.class})
public class TestSuite {
}
