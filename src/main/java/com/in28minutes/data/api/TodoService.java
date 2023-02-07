package com.in28minutes.data.api;

import java.util.List;

// 3. External Service - Lets say this comes from WunderList with List of data in it.
// 4. Create a stub TodoServiceStub (in test java) that will be used in place of TodoService for testing
// 5. Test TodoBusinessImpl using TodoServiceStub

public interface TodoService {
    public List<String> retrieveTodos(String user);
}
