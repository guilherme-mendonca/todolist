package todolist.service;

import todolist.entity.Todo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import todolist.repository.TodoRepository;

import java.util.List;

@Service // Registra esta classe como um componente de serviço do Spring
public class TodoService {

  private final TodoRepository todoRepository;

  // Injeção de dependência via construtor
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> create(Todo todo) {
    todoRepository.save(todo);
    return list();
  }
  public List<Todo> list() {
    // Cria uma regra de ordenação: prioridade descendente (maior primeiro) e nome ascendente
    Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending());
    return todoRepository.findAll(sort);
  }
  public List<Todo> update(Todo todo) {
    todoRepository.save(todo);
    return list();
  }
  public List<Todo> delete(Long id) {
    todoRepository.deleteById(id);
    return list();
  }
}
