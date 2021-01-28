package com.lekwacious.todo.todosimplesecurity.repository;


import com.lekwacious.todo.todosimplesecurity.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, String> {
}
