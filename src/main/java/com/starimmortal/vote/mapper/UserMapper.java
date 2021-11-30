package com.starimmortal.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.starimmortal.vote.dto.LoginDTO;
import com.starimmortal.vote.pojo.UserDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  用户 Mapper 接口
 * </p>
 *
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
@Repository
public interface UserMapper extends BaseMapper<UserDO> {
    //搜索判断该用户是否存在
    UserDO selectByOpenid(String openid);
}
