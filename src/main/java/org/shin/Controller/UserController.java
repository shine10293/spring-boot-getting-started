package org.shin.Controller;


import org.shin.Domain.User;
import org.shin.Service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    final UserService userService;

    private UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/findUser/{id}")
    public Optional<User> findUserById(@PathVariable("id") String id) {
        Optional<User> user = userService.getUserById(id);

        return user;
    }
}
