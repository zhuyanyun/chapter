package com.smart.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-10 19:17
 * @Vertion 1.0
 **/

@Entity
@Data
public class Reader implements UserDetails {

    private static final long seriaVersionUID = 1L;

    @Id
    private String username;
    private String fullname;
    private String password;

    @Override public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("READER"));
    }

    @Override public boolean isAccountNonExpired() {
        return false;
    }

    @Override public boolean isAccountNonLocked() {
        return false;
    }

    @Override public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override public boolean isEnabled() {
        return false;
    }
}
