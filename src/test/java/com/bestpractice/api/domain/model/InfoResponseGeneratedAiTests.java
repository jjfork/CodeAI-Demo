package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.Test
public class InfoResponseGeneratedAiTests {

  private InfoResponse infoResponse;

  @org.junit.jupiter.api.BeforeEach
  void setUp() {
    this.infoResponse = new InfoResponse("123", "Example Title", "Example Description");
  }

  @org.junit.jupiter.api.Test
  void getId() {
    // GIVEN a new InfoResponse object with id "123"
    // WHEN the getId() method is called
    // THEN the method returns the string "123"
    assertEquals("123", infoResponse.getId());
  }

  @org.junit.jupiter.api.Test
  void getTitle() {
    // GIVEN a new InfoResponse object with title "Example Title"
    // WHEN the getTitle() method is called
    // THEN the method returns the string "Example Title"
    assertEquals("Example Title", infoResponse.getTitle());
  }

  @org.junit.jupiter.api.Test
  void getDescription() {
    // GIVEN a new InfoResponse object with description "Example Description"
    // WHEN the getDescription() method is called
    // THEN the method returns the string "Example Description"
    assertEquals("Example Description", infoResponse.getDescription());
  }
}
