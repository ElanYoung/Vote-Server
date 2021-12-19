package com.starimmortal.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.starimmortal.vote.pojo.PlayDO;
import com.starimmortal.vote.pojo.VoteDO;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * <p>
 *  参赛选手表mapper
 * </p>
 *
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
@Repository
public interface PlayerMapper extends BaseMapper<PlayDO> {
    /**
     * 查询所有的值包含图片 级联查询 参赛选手信息
     * @return
     */
    List<PlayDO> selectPlayerAllData(Integer voteId);
}
