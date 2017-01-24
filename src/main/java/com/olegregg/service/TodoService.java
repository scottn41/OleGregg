package com.olegregg.service;

import com.olegregg.domain.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAllTodo();
    Todo findTodoByGuid(String guid);

}
