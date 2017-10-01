package com.shop.vapor.service;

import com.shop.vapor.persistance.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
                User user = userService.findByEmail(userName);
                if(Objects.isNull(user)){
                throw new UsernameNotFoundException("User was not found");
                }
        return new MyUserDatail(user);
    }


    private class MyUserDatail extends User implements UserDetails {
        public MyUserDatail(User user) {
             super(user);
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            List<Role> roles = new ArrayList<>();
            roles.add(new Role(getRole()));
            return roles;
        }

        @Override
        public String getPassword() {
            return "123";
        }

        @Override
        public String getUsername() {
            return getEmail();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
        class Role implements GrantedAuthority{
            private String role;

            public Role(String role) {
                this.role = role;
            }

            @Override
            public String getAuthority() {
                return role;
            }
        }
    }
}
