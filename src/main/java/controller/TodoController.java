package controller;

import entity.Todo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TodoService;

import java.util.List;

@RestController // Define que esta classe responde requisições HTTP (JSON)
@RequestMapping("/todos") // Prefixo da URL: localhost:8080/todos
public class TodoController {
  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @PostMapping // Rota para criar (POST /todos)
  List<Todo> create(@RequestBody Todo todo) {
    return todoService.create(todo);
  }

  @GetMapping // Rota para listar (GET /todos)
  List<Todo> list() {
    return todoService.list();
  }

  @PutMapping // Rota para atualizar (PUT /todos)
  List<Todo> update(Todo todo) {
    return todoService.update(todo);
  }

  @DeleteMapping("{id}") // Rota para deletar (DELETE /todos/1)
  List<Todo> delete(@PathVariable("id") Long id) {
    return todoService.delete(id);
  }
}
