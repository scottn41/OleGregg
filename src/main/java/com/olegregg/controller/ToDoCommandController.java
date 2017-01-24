package com.olegregg.controller;

import com.olegregg.domain.ToDo;
import com.olegregg.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.net.URI;

@RestController
public class ToDoCommandController {

    @Resource
    private TodoService todoService;

    @RequestMapping(method = RequestMethod.POST, value = "/todo")
    public ResponseEntity<Void> getSingleTodo(@RequestBody ToDo request) {

        ToDo todo = todoService.addToDo(request);

        return ResponseEntity.created(URI.create(todo.getGuid())).build();
    }
}
