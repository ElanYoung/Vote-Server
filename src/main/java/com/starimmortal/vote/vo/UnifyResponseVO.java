package com.starimmortal.vote.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 统一API响应结果封装
 *
 * @param <T>
 * @author william@StarImmortal
 * @date 2021/02/08
 */
@Data
@Builder
@AllArgsConstructor
public class UnifyResponseVO<T> {
    private Integer code;

    private T data;

    private String message;
}
