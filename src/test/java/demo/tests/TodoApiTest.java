package demo.tests;

import org.testng.annotations.Test;

public class TodoApiTest {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test(description = "GET /todos/1, deserialize JSON into a POJO, and verify one attribute")
    public void shouldReadTodoAndVerifyTitle() throws Exception {
        String expectedTitle = "delectus aut autem";

        // 1. Send the GET request with Rest Assured.

        // 2. Convert the JSON response into a Java object with Jackson.

        // 3. Verify title attribute with TestNG.
    }
}
