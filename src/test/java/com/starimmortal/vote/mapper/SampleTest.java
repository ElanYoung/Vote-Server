package com.starimmortal.vote.mapper;

import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class SampleTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void nortest() {
        UserDO userDO = new UserDO();
        UUID uuid = UUID.randomUUID();
//        userDO.setId(5);
        userDO.setOpenid(uuid.toString());
        userDO.setUnionid("321");
        userDO.setNickname("纸素1234567");
        userDO.setAvatarUrl("https://thirdwx.qlogo.cn/mmopen/vi_32/PiajxSqBRaEIhzpfcHpNvXY8oFxfPZicdHD4NHwfTTavlXCxaIkia62PHslMgicVOqcmDf18DulffPzK1dxOias3aWQ/132");
        int insert = userService.getBaseMapper().insert(userDO);

//        userService.updateById(userDO);
    }
}
