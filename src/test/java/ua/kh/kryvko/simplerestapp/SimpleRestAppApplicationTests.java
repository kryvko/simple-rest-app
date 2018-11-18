package ua.kh.kryvko.simplerestapp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ua.kh.kryvko.simplerestapp.controllers.HelloWorldControllerTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HelloWorldControllerTest.class
})
public class SimpleRestAppApplicationTests {

}
