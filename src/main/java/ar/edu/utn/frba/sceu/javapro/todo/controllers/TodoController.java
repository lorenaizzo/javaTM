package ar.edu.utn.frba.sceu.javapro.todo.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import ar.edu.utn.frba.sceu.javapro.todo.models.*;

@RestController
@RequestMapping("todo")
public class TodoController {

	
	@GetMapping("/")
	public List<TodoModel> listarTodos() {
		ArrayList<TodoModel> tareas = new ArrayList<TodoModel>();
		
		for(int i=1; i <10; i++) {
			TodoModel unaTarea = new TodoModel("tarea"+i, new Date(), false, null);
			tareas.add(unaTarea);
		}
		
		return tareas;
	}
				
	@GetMapping("/{id}")
	public String listarUno(@PathVariable Integer id) {
		return "Hola get";
	}
	
	
	@PostMapping("/")
	public String guardar() {
		return "Hola post";
	}
	
	
}
