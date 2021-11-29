package com.starimmortal.vote.controller.v1;


import cn.hutool.json.JSON;
import com.starimmortal.vote.dto.LoginDTO;
import com.starimmortal.vote.mapper.UserMapper;
import com.starimmortal.vote.pojo.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/login")
//    public String login(@RequestBody LoginDTO dto) {
//        System.out.println("nickName:"+dto.getNickName());
//        return null;
//    }
    public String login(@RequestParam("nickName") String nickName) {
        System.out.println(nickName);
//        System.out.println(gender);
        return null;
    }

}
