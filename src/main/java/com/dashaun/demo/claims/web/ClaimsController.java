package com.dashaun.demo.claims.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimsController {

    @GetMapping("/api/claims")
    public String claims() {
        return "[{\"id\":\"CL-90021\",\"policyNumber\":\"PL-40012\","
                + "\"status\":\"IN_REVIEW\"}]";
    }

    @GetMapping("/api/claims/{id}")
    public String claim(@PathVariable String id) {
        return "{\"id\":\"" + id + "\",\"policyNumber\":\"PL-40012\","
                + "\"status\":\"IN_REVIEW\",\"adjuster\":\"A-77\","
                + "\"estimate\":2140.00,\"opened\":\"2026-09-28\"}";
    }
}
