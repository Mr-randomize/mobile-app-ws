package com.iviberberi.app.ws.ui.controller;

import com.iviberberi.app.ws.ui.model.request.LoginRequestModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @PostMapping("/login")
    public void theFakeLogin(@RequestBody LoginRequestModel loginRequestModel) {
        throw new IllegalStateException("This method is implemented by Security");
    }
}
