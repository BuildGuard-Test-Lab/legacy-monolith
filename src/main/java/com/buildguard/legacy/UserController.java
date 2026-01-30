package com.buildguard.legacy;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public List<Map<String, Object>> getUsers() {
        return List.of(
            Map.of("id", 1, "name", "Admin", "role", "admin"),
            Map.of("id", 2, "name", "User", "role", "user")
        );
    }

    @GetMapping("/api/orders")
    public List<Map<String, Object>> getOrders() {
        return List.of(
            Map.of("id", 101, "status", "shipped", "total", 49.99)
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "healthy", "service", "legacy-monolith");
    }
}
