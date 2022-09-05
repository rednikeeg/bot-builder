package com.rednikeeg.bbuilder.config.model;

import com.rednikeeg.bbuilder.config.controller.ActionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Session {
    private Action currentAction;
    @Autowired
    private ActionController actionController;
}
