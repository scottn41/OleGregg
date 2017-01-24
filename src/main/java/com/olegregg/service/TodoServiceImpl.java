package com.olegregg.service;

import com.olegregg.domain.ToDo;
import com.olegregg.repository.TodoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class TodoServiceImpl implements TodoService {

    @Resource
    TodoRepository todoRepository;

    @Override
    public List<ToDo> findAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public ToDo findTodoByGuid(String guid) {
        return todoRepository.findByGuid(guid);
    }

    @Override
    public ToDo addToDo(ToDo todo) {


        if (Objects.isNull(todo.getGuid())){
            todo.setGuid(UUID.randomUUID().toString());
        }

        todo.setCreated(new Date());
        todo.setUpdated(new Date());


        return todoRepository.save(todo);

    }
}
