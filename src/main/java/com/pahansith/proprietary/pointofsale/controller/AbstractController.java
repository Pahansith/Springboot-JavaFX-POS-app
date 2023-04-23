package com.pahansith.proprietary.pointofsale.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;

public class AbstractController {
    @FXML
    private Node root;

    public Node getRoot(){
        return this.root;
    }
}
