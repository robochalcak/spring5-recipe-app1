package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.SetterInjectedController;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
