package com.example.springOauth.security;

import com.example.springOauth.document.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class JwtToUserConverter implements Converter<Jwt, UsernamePasswordAuthenticationToken> {
    @Override
    public UsernamePasswordAuthenticationToken convert(Jwt source) {

        User user = new User();
        user.setId(Integer.parseInt(source.getSubject()));

        return new UsernamePasswordAuthenticationToken(user,source, Collections.EMPTY_LIST);
    }
}
