package controllers.rest;

import java.util.ArrayList;

import models.Todo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TodoController{

    @RequestMapping("/rest/todos")
    @ResponseBody
    public ArrayList<Todo> listTodos() {
        return new ArrayList<Todo>();
    }
}