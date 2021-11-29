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
    private String nickName;
    private String avatar_url;
    private String session_key;
    private String wx_profile;

}
