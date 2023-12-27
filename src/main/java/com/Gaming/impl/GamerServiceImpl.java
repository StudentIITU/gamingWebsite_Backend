package com.Gaming.impl;

import com.Gaming.components.Gamer;
import com.Gaming.repository.GamerRepo;
import com.Gaming.services.GamerService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GamerServiceImpl implements GamerService {

    private GamerRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Gamer gamer = repo.findByEmail(username);
        if (gamer != null) {
            User secUser = new User(gamer.getEmail(), gamer.getPassword(), gamer.getRoles());

            return secUser;
        }
        throw new UsernameNotFoundException("User not found");
    }
}
