package com.virus.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

import com.virus.data.api.TodoService;
import com.virus.data.api.TodoServiceStub;
import com.virus.data.business.TodoBusinessImpl;

public class TodoBusinessImplmockTest {
	
	@Test
	public void testRetrieveTodoRelatedToString_usingAMock() {
		TodoService todoServiceMock = mock(TodoService.class); 
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy"); 
		assertEquals(2, filteredTodos.size()); 
        assertTrue(filteredTodos.contains("Learn Spring MVC")); // Check if "Learn Spring MVC" is in the list
        assertTrue(filteredTodos.contains("virus")); // Check if "Learn Spring" is in the list
        assertFalse(filteredTodos.contains("Learn to Dance")); 
		
	}
	
}
