package com.pahansith.proprietary.pointofsale;

import javafx.fxml.FXMLLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AppInitializer {

    @Autowired
    private ControllerBuilderFactory controllerFactory;

    @Autowired
    private ViewConstants viewConstants;

    @PostConstruct
    public void init() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setBuilderFactory(controllerFactory);

        viewConstants.setLoader(fxmlLoader);
    }
}
