package com.Gaming.service.impl;

import com.Gaming.entities.GamerEntity;
import com.Gaming.impl.GamerDetailsImpl;
import com.Gaming.repository.GamerRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;  // Add this import

@AllArgsConstructor
@Service  // Add this annotation
public class GamerDetailsServiceImpl implements UserDetailsService {
    GamerRepo gamerRepo;  // Make the field final



    @Override
    public GamerDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        GamerEntity gamerEntity = gamerRepo.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        return GamerDetailsImpl.build(gamerEntity);
    }

}
