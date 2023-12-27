package com.Gaming.service;

import com.Gaming.entities.GamerEntity;
import com.Gaming.repository.GamerRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GamerService {
    GamerRepo gamerRepo;
    private BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    public void saveGamer(GamerEntity gamerEntity) {
        gamerEntity.setPassword(encoder().encode(gamerEntity.getPassword()));
        gamerRepo.save(gamerEntity);
    }
}
