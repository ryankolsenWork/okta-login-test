package com.example.pwwsamlauthv2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.saml.SAMLAuthenticationProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

  @RequestMapping("/")
  public String home(@AuthenticationPrincipal SAMLAuthenticationProvider principal, Model model) {
//    model.addAttribute("name", principal.getUserDetails());
//    model.addAttribute("emailAddress", principal.getUserDetails());
    model.addAttribute("userAttributes", principal.getUserDetails());
    return "home";
  }

}