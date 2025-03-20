package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import com.bestpractice.api.infrastrucuture.persistent.User; 

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

public class RdbmsUserPersistentRepositoryTest {

    @Autowired
    private UserPersistentRepository userPersistentRepository; 

    // ... rest of your test code
}
