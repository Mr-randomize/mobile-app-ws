package com.iviberberi.app.ws.shared;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UtilsTest {

    @Autowired
    Utils utils;

    @BeforeEach
    void setUp() {
    }

    @Test
    final void testGenerateUserId() {
        String userId = utils.generateUserId(30);
        String userId2 = utils.generateUserId(30);

        assertNotNull(userId);
        assertNotNull(userId2);

        assertTrue(userId.length() == 30);
        assertTrue(!userId.equalsIgnoreCase(userId2));
    }

    @Test
    final void testHasTokenNotExpired() {
        String token = utils.generateEmailVerificationToken("4yr65hhyid84");
        assertNotNull(token);

        boolean hasTokenExpired = Utils.hasTokenExpired(token);
        assertFalse(hasTokenExpired);
    }

    @Test
    final void testHasTokenExpired() {
        String expiredToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJRREZuTnhTYnhNSnBFSWdrQVJLa05TOHVqaWl3WVYiLCJleHAiOjE1ODA0ODc4MzJ9.jO12ntH4a2ag4SWxdW7_NXaqIsW95wMVrk5v-LkAra3WuBIQRQzuE7C5V6e0XdhsPDOntdzd743XLibmuXfkUQ";
        boolean hasTokenExpired = Utils.hasTokenExpired(expiredToken);

        assertTrue(hasTokenExpired);
    }
}