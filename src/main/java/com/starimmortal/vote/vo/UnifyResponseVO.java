package com.starimmortal.vote.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.starimmortal.vote.common.enumeration.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.BindingResult;

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
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class UnifyResponseVO<T> {
    private Integer code;
    private String message;
    private T data;

    public UnifyResponseVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public UnifyResponseVO(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public static <T> UnifyResponseVO<T> success() {
        return new UnifyResponseVO<>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getDesc());
    }

    public static <T> UnifyResponseVO<T> success(T data) {
        return new UnifyResponseVO<>(ResponseEnum.SUCCESS.getCode(), data);
    }

    public static <T> UnifyResponseVO<T> error(ResponseEnum responseEnum) {
        return new UnifyResponseVO<>(responseEnum.getCode(), responseEnum.getDesc());
    }

    public static <T> UnifyResponseVO<T> error(ResponseEnum responseEnum, String msg) {
        return new UnifyResponseVO<>(responseEnum.getCode(), msg);
    }

}
