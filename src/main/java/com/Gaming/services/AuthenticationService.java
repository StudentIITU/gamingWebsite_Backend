//package com.Gaming.services;
//
//
//import com.Gaming.components.Gamer;
//import com.Gaming.components.Role;
//import com.Gaming.config.JWTService;
//import com.Gaming.controllers.AuthenticationRequest;
//import com.Gaming.controllers.RegisterRequest;
//import com.Gaming.repository.GamerRepo;
//import com.Gaming.responses.AuthenticationResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class AuthenticationService {
//    private final GamerRepo repo;
//    private final PasswordEncoder passwordEncoder;
//    private final JWTService jwtservice;
//    private final AuthenticationManager authenticationManager;
//
//    public AuthenticationResponse register(RegisterRequest request) {
//        var gamer = Gamer.builder()
//                .username(request.getUsername())
//                .email(request.getEmail())
//                .password(passwordEncoder.encode(request.getPassword()))
//                .role(Role.USER)
//                .build();
//        repo.save(gamer);
//        var jwtToken = jwtservice.generateToken(gamer);
//        return AuthenticationResponse.builder()
//                .token(jwtToken)
//                .build();
//    }
//
//    public AuthenticationResponse login(AuthenticationRequest request) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.getEmail(),
//                        request.getPassword()
//                )
//        );
//        var gamer = repo.findByEmail(request.getEmail())
//                .orElseThrow();
//        var jwtToken = jwtservice.generateToken(gamer);
//        return AuthenticationResponse.builder()
//                .token(jwtToken)
//                .build();
//    }
//}
