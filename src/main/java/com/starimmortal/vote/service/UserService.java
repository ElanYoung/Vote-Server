package com.starimmortal.vote.service;

import com.starimmortal.vote.pojo.UserDO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  用户服务类
 * </p>
 *
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
public interface UserService extends IService<UserDO> {
    //搜索判断该用户是否存在
    UserDO selectByOpenid(String openid);
}
