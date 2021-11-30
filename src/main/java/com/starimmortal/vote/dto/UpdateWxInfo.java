package com.starimmortal.vote.dto;

import lombok.Data;

@Data
public class UpdateWxInfo {
    private String nickName;
    private String avatarUrl;
    private String country;
    private String city;
    private String province;
    private int gender;
    private String language;
}
