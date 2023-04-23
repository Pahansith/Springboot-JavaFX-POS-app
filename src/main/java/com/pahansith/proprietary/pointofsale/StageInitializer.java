/*
 * Copyright (C) 2022. Pahan Samali (Pvt) Ltd
 * All Rights Reserved.
 * Unauthorized copying/redistribution of this file, via any medium
 * is strictly prohibited.
 * Proprietary and confidential.
 * Licensed under the Pahan Samali (Pvt) Ltd Commercial License,
 * Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package com.pahansith.proprietary.pointofsale;

import com.pahansith.proprietary.pointofsale.controller.HelloController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StageInitializer implements ApplicationListener<PosMain.StageReadyEvent> {
    @Value("classpath:/view/hello-view.fxml")
    private Resource mainView;
    private final String title;

    public StageInitializer(@Value("${spring.application.ui.title}") String title) {
        this.title = title;
    }

    @Autowired
    private ApplicationContext context;

    @Autowired
    private HelloController helloController;

    @Override
    public void onApplicationEvent(PosMain.StageReadyEvent event) {
        Stage stage = event.getStage();
        ViewConstants.stage = stage;
        Scene scene = new Scene((Parent) helloController.getRoot());
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
        ViewConstants.stage = stage;
    }
}
