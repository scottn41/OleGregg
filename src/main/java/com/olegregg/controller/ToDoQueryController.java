package com.olegregg.controller;

import com.olegregg.domain.ToDo;
import com.olegregg.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class ToDoQueryController {

    @Resource private TodoService todoService;

    @RequestMapping(method= RequestMethod.GET, value="/todo/{guid}")
    public ResponseEntity<ToDo> getSingleTodo(@PathVariable String guid) {
        return ResponseEntity.ok(todoService.findTodoByGuid(guid));
    }

    @RequestMapping(method=RequestMethod.GET, value="/todo")
    public ResponseEntity<List<ToDo>> getAllTodo() {
        return ResponseEntity.ok(todoService.findAllTodo());
    }
}
