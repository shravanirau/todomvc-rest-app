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
        ArrayList<Todo> results = new ArrayList<Todo>();
        results.add(new Todo("Todo Text 1"));
        results.add(new Todo("Todo Text 2"));
        results.add(new Todo("Todo Text 3"));
        results.add(new Todo("Todo Text 4"));
        results.add(new Todo("Todo Text 5"));
        results.add(new Todo("Todo Text 6"));
        
        return results;
    }
}