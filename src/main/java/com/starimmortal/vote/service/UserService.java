package com.starimmortal.vote.service;

import com.starimmortal.vote.dto.LoginDTO;
import com.starimmortal.vote.pojo.UserDO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.starimmortal.vote.vo.UnifyResponseVO;

/**
 * <p>
 *  用户服务类
 * </p>
 *
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
public interface UserService extends IService<UserDO> {

    /**
     * 登录并且判断该用户是否存在
     *
     * @param loginDTO
     * @return
     */
    UnifyResponseVO<UserDO> checkLogin(LoginDTO loginDTO) throws Exception;
}
