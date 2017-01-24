package com.olegregg.service;

import com.olegregg.domain.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Override
    public List<ToDo> findAllTodo() {
        return null;
    }

    @Override
    public ToDo findTodoByGuid(String guid) {
        return null;
    }
}
