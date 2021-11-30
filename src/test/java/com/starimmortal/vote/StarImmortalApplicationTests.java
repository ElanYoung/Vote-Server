package com.starimmortal.vote;

import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StarImmortalApplicationTests {

	@Autowired
	private UserServiceImpl userService;

	@Test
	void contextLoads() {
		UserDO userDO = new UserDO();
		userDO.setOpenid("123");
		userDO.setUnionid("321");
		userDO.setNickname("纸素");
		userDO.setAvatarUrl("https://thirdwx.qlogo.cn/mmopen/vi_32/PiajxSqBRaEIhzpfcHpNvXY8oFxfPZicdHD4NHwfTTavlXCxaIkia62PHslMgicVOqcmDf18DulffPzK1dxOias3aWQ/132");
		int insert = userService.getBaseMapper().insert(userDO);
		if(insert>0){
			System.out.println("insert success");
		}else {
			System.out.println("insert fail");
		}
	}

}
