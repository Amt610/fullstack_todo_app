package com.amit.internship.todo_app.Repository;

import com.amit.internship.todo_app.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Long, Todo> {
}
