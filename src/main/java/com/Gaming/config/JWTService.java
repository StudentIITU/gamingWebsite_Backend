//package com.Gaming.config;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.io.Decoders;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//import java.security.Key;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//
//@Service
//public class JWTService {
//
//    public static final String SECRET_KEY = "Sq03EHFA7lSqeM79Skojc9SAcKzEut/JEgGFcnhnPrCiGrp8nh1loCTtyziYgqWKEE/Xl/8/BTD9fYdRNd0j5N/KpD8sjMFxJ8KpqHm/BGuZrHGV6EStX4mDXV6yiqPP6Vu36P18u8GfbhjeQnXEQ+HlQxMnNrjZ3iJer73tR9DLIFaHWvD2OkI07Pv329gE0m9bcHG9ZQ7yV1k1RN/iZowVzQ1ofHckKSsYkcTgDkwEOemuPlGwkaHwBDanNc7zVBe74QCx34pHeYvtaRP+sXZjSldo8/QUnWRwsOrHlJSgdsaelqEHIIPyLE6phA2KRWGF/2I6VPIGRFwD+z5ko/lTbAjOXQYwXtz3g+9YvIw=";
//    public String extractUsername(String token) {
//        return extractClaim(token, Claims::getSubject);
//    }
//
//    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//        final Claims claims = extractAllClaims(token);
//        return claimsResolver.apply(claims);
//    }
//
//    public String generateToken(UserDetails gamerDetails) {
//        return generateToken(new HashMap<>(), gamerDetails);
//    }
//
//    public String generateToken(Map<String, Object> ExtraClaims, UserDetails gamerDetails) {
//        return Jwts
//                .builder()
//                .setClaims(ExtraClaims)
//                .setSubject(gamerDetails.getUsername())
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
//                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
//                .compact();
//    }
//
//    public boolean isTokenValid(String token, UserDetails gamerDetails) {
//        final String username = extractUsername(token);
//        return (username.equals(gamerDetails.getUsername())) && !isTokenExpired(token);
//    }
//
//    private boolean isTokenExpired(String token) {
//        return extractExpiration(token).before(new Date());
//    }
//
//    private Date extractExpiration(String token) {
//        return extractClaim(token, Claims::getExpiration);
//    }
//
//    private Claims extractAllClaims(String token) {
//        return
//                Jwts.parserBuilder()
//                        .setSigningKey(getSignInKey())
//                        .build()
//                        .parseClaimsJws(token)
//                        .getBody();
//    }
//
//    private Key getSignInKey() {
//        byte [] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
//        return Keys.hmacShaKeyFor(keyBytes);
//    }
//}
