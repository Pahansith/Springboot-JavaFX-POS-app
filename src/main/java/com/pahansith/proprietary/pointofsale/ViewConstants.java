package com.pahansith.proprietary.pointofsale;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Configuration
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ViewConstants {
    @Value("classpath:/view/test-view.fxml")
    public Resource testView;

    @Value("classpath:/view/hello-view.fxml")
    public Resource helloView;
    public static Stage stage;
    public FXMLLoader loader;

    public void setLoader(FXMLLoader loader) {
        this.loader = loader;
    }

    public FXMLLoader getLoader() {
        return this.loader;
    }
}
