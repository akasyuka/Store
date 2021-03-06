package com.akasyuka.website.controller;

import com.akasyuka.website.entity.Role;
import com.akasyuka.website.entity.User;
import com.akasyuka.website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model) {
        User userFromDb = userRepository.findByUserName(user.getUserName());

        if (userFromDb != null) {
            model.put("message", "User exist!");
            return "registration";
        }
        user.setUserActive(true);
        user.setRoleName(Collections.singleton(Role.USER));
        userRepository.save(user);
        return "redirect:/login";
    }
}
