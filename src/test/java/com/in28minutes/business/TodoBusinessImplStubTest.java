package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

// 7. Create object of TodoService with TodoServiceStub and call the retrieveTodos method with any value as we have
//    hard coded the return list already.

public class TodoBusinessImplStubTest {
    @Test
    public void testRetriveTodosRelatedToSpring_usingAStub(){
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("test String");

        // The TodoBusinessImpl retrieveTodosRelatedToSpring should return 2 Strings as the test data is having
        // 2 Strings with "Spring" in it.

        assertEquals(2, filteredTodos.size());

    }
}
