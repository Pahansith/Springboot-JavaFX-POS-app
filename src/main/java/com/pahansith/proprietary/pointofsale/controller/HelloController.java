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

package com.pahansith.proprietary.pointofsale.controller;

import com.pahansith.proprietary.pointofsale.ViewConstants;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.swing.text.View;
import java.io.IOException;

public class HelloController extends AbstractController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btn1;

    @Autowired
    private ViewConstants viewConstants;

    @Autowired
    private TestController testController;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        Scene scene = new Scene((Parent) testController.getRoot());
        Stage stage = ViewConstants.stage;
        stage.setScene(scene);
        stage.show();
    }
}