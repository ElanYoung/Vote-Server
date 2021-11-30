package com.starimmortal.vote.service.impl;

import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.mapper.UserMapper;
import com.starimmortal.vote.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  用户服务实现类
 * </p>
 *
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDO selectByOpenid(String openid) {
        return userMapper.selectByOpenid(openid);
    }
}
