package com.db.grad.javaapi.security;

import com.db.grad.javaapi.model.UserT;
import com.db.grad.javaapi.repository.UserTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserTRepository userTRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserT userT = userTRepository.getUserByName(username);
        if (userT == null){
            throw new UsernameNotFoundException("Could not find the user");
        }

        return new MyUserDetails(userT);
    }
}
