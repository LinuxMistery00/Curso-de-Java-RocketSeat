package br.com.danieleleao.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    public void create() {

    }

    @PostMapping("/")
    public void create(@RequestBody UserModel UserModel) {
         System.out.println(UserModel.name);
    }
}
