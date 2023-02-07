package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

// 6. Implement the original TodoService and pass test values here so that we can pass it in TodoBusinessImplStubTest.

public class TodoServiceStub implements TodoService{
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Mockito with Spring", "Learn to make test cases with Spring", "Learn to implement in your code");
    }
}
