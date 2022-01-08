package com.starimmortal.vote.service;

import com.starimmortal.vote.dto.LoginDTO;
import com.starimmortal.vote.dto.VoteTimeDTO;
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

    /**
     * 投票人增加票数
     * @param voteTimeDTO
     * @return
     * @throws Exception
     */
    UnifyResponseVO<Integer> takeVoteUpdate(VoteTimeDTO voteTimeDTO) throws Exception;

}
