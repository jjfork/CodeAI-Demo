package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - None
        // WHEN - Call the serverError method with an exception```java
package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.ErrorResponse; 

import static org.junit.jupiter.api.Assertions.assertThrows;
package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;

class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - None
        // WHEN - Call the badRequest method
        ErrorResponse response = adviceController.badRequest();
        // THEN - Assert that the status is 400
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
        // THEN - Assert that the error is "Bad request"
        assertEquals("Bad request", response.getError());
        // THEN - Assert that the message is "Bad request parameter"
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - None
        // WHEN - Call the unAuthorized method
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - Assert that the status is 401
        assertEquals(HttpStatus.UNAUTHORIZED.value(), response.getStatus());
        // THEN - Assert that the error is "Unauthorized"
        assertEquals("Unauthorized", response.getError());
        // THEN - Assert that the message is "Incorrect authentication info"
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - None
        // WHEN - Call the forbidden method
        ErrorResponse response = adviceController.forbidden();
        // THEN - Assert that the status is 403
        assertEquals(HttpStatus.FORBIDDEN.value(), response.getStatus());
        // THEN - Assert that the error is "Forbidden"
        assertEquals("Forbidden", response.getError());
        // THEN - Assert that the message is "Not allowed"
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - None
        // WHEN - Call the notFound01 method
        ErrorResponse response = adviceController.notFound01();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - None
        // WHEN - Call the notFound02 method
        ErrorResponse response = adviceController.notFound02();
        // THEN - Assert that the status is 404
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());
        // THEN - Assert that the error is "Not found"
        assertEquals("Not found", response.getError());
        // THEN - Assert that the message is "Not found path"
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - None
        // WHEN - Call the conflict method
        ErrorResponse response = adviceController.conflict();
        // THEN - Assert that the status is 409
        assertEquals(HttpStatus.CONFLICT.value(), response.getStatus());
        // THEN - Assert that the error is "Conflict"
        assertEquals("Conflict", response.getError());
        // THEN - Assert that the message is "Already exist data"
        assertEquals("Already exist data", response.getMessage());
    }