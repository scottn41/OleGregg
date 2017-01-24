package com.olegregg.service;

import com.olegregg.domain.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Override
    public List<Todo> findAllTodo() {
        return null;
    }

    @Override
    public Todo findTodoByGuid(String guid) {
        return null;
    }
}
