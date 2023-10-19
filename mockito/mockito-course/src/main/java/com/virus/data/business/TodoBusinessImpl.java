package com.virus.data.business;

import java.util.ArrayList;
import java.util.List;

import com.virus.data.api.TodoService;

public class TodoBusinessImpl {
		private TodoService todoService;

		public TodoBusinessImpl(TodoService todoService) {
			super();
			this.todoService = todoService;
		} 
		
		public List<String> retrieveTodoRelatedToSpring(String user) {
			List<String> filteredTodo = new ArrayList<String>(); 
			List<String> todos = todoService.retrieveTodos(user); 
			
			for(String todo : todos) {
				if(todo.contains("Spring")) {
					filteredTodo.add(todo); 
				}
			}
			return filteredTodo; 
		}
		
}
