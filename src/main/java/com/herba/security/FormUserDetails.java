package com.herba.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
public class FormUserDetails implements UserDetails {
    private int uid;
    private String username;
    private String screenName;
    private String password;
    private String mail;
    private String url;
    private boolean enabled;
    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public FormUserDetails(int uid, String username, String screenName, String password, String mail,String url, boolean enabled, Collection<? extends GrantedAuthority> authorities) {
        this.uid = uid;
        this.username = username;
        this.screenName = screenName;
        this.password = password;
        this.mail = mail;
        this.url =url;
        this.enabled = enabled;
        this.authorities = authorities;
    }

    @Override
    public String getPassword() {
        return password;
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
}
