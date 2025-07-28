package com.bestpractice.api.domain.service;

doThrow(new InternalServerError("An error occurred while saving the user to the repository.")).when(userRepository).insert(any());

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

    // THEN
    assertThrows(InternalServerError.class, () -> userService.generateUser(request));
