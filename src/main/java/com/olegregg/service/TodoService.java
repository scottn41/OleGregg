package com.olegregg.service;

import com.olegregg.domain.ToDo;

import java.util.List;

public interface TodoService {

    List<ToDo> findAllTodo();
    ToDo findTodoByGuid(String guid);

    ToDo addToDo(ToDo todo);

}
