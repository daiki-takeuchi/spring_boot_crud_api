package jp.co.gaban.spring_boot_crud_api.model;

import lombok.Data;

/**
 * Created by takeuchidaiki on 2024/06/30
 */
@Data
public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }
}
