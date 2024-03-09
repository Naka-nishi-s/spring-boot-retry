package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactForm {
	
	@GetMapping("/nice")
	public ResponseEntity<String> getNice() {
		return ResponseEntity.ok("Nice Job! Endpoint is Doing!");
	}
	
	@PostMapping("/register")
	public ResponseEntity<RegisterBean> register(@RequestBody RegisterBean rb) {
		return ResponseEntity.ok(rb);
	}
}
