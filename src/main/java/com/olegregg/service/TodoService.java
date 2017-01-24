package com.olegregg.service;

import com.olegregg.domain.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAllTodo();
    List<Todo> findTodoByGuid(String guid);

}
