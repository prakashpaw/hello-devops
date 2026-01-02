
package com.example.devops.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppServiceTest {
    @Test
    void greetShouldContainName() {
        AppService svc = new AppService();
        String msg = svc.greet("Prakash");
        assertTrue(msg.contains("Prakash"));
    }
}
