/**
 * 
 */
package com.turkmen.security.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author TTTDEMIRCI
 *
 */
public class UserDetail implements UserDetails {

    private String userName;
    private String token;
    private Long id;
    private Collection<? extends GrantedAuthority> authorities;


    public UserDetail(String userName, long id, String token, List<GrantedAuthority> grantedAuthorities) {

        this.userName = userName;
        this.id = id;
        this.token= token;
        this.authorities = grantedAuthorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return userName;
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


    public String getUserName() {
        return userName;
    }

    public String getToken() {
        return token;
    }


    public Long getId() {
        return id;
    }

}