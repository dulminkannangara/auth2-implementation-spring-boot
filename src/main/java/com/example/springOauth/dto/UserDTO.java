package com.example.springOauth.dto;

import com.example.springOauth.document.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private String id;
    private String username;

    public static UserDTO from(User user) {
        return builder()
                .id(String.valueOf(user.getId()))
                .username(user.getUsername())
                .build();
    }
}
