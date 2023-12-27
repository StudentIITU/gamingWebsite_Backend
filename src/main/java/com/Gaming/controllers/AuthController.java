//package com.Gaming.controllers;
//
//
//import com.Gaming.responses.AuthenticationResponse;
//import com.Gaming.services.AuthenticationService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/gamer")
//@RequiredArgsConstructor
//public class AuthController {
//
//    private final AuthenticationService authenticationService;
//
//
//
//    @PostMapping("/register")
//    public ResponseEntity<AuthenticationResponse> register(
//            @RequestBody RegisterRequest request) {
//        return ResponseEntity.ok(authenticationService.register(request));
//    }
//
//
//
//    @PostMapping("/login")
//    public ResponseEntity<AuthenticationResponse> login(
//            @RequestBody AuthenticationRequest request) {
//        return ResponseEntity.ok(authenticationService.login(request));
//
//    }
//
//}
