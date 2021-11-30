package com.starimmortal.vote.dto;

import lombok.Data;

/**
 * @author william@StarImmortal
 * @date 2021/11/25
 */
@Data
public class LoginDTO {
    private String openid;
    private String unionid;
    private String nickname;
    private String avatarUrl;
    private String sessionKey;
    private UpdateWxInfo wxProfile;
    private String code;

}
