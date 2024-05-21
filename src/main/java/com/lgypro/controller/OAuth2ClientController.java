package com.lgypro.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth2/api/client")
public class OAuth2ClientController {
    @Resource
    private ClientRegistrationRepository clientRegistrationRepository;

    @GetMapping("/list")
    public ClientRegistration list() {
        return this.clientRegistrationRepository.findByRegistrationId("my-oauth-demo");
    }
}
