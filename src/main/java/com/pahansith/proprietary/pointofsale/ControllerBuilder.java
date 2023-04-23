package com.pahansith.proprietary.pointofsale;

import com.pahansith.proprietary.pointofsale.controller.HelloController;
import com.pahansith.proprietary.pointofsale.controller.TestController;
import javafx.fxml.FXMLLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class ControllerBuilder {
    @Autowired
    private ViewConstants viewConstants;

    @Bean
    public TestController getTestController() throws IOException {
        return (TestController) this.loadController(viewConstants.testView);
    }

    @Bean
    public HelloController getHelloController() throws IOException {
        return (HelloController) this.loadController(viewConstants.helloView);
    }

    protected Object loadController(Resource url) throws IOException {
        FXMLLoader loader = new FXMLLoader(url.getURL());
        loader.load();
        return loader.getController();
    }
}
