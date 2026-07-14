package com.amit.internship.todo_app.Service;

import com.amit.internship.todo_app.Entity.Todo;
import com.amit.internship.todo_app.Repository.TodoRepository;

import java.util.List;

public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository repository){
        this.todoRepository=repository;
    }

    //Get All
    public List<Todo> getAllTodos(){

    }
}
