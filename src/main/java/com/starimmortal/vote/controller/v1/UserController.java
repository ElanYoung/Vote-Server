package com.starimmortal.vote.controller.v1;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.starimmortal.vote.common.util.RestUtil;
import com.starimmortal.vote.dto.LoginDTO;
import com.starimmortal.vote.mapper.UserMapper;
import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.service.UserService;
import com.starimmortal.vote.service.impl.UserServiceImpl;
import com.starimmortal.vote.vo.UnifyResponseVO;
import org.springframework.beans.BeanUtils;
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
    UserService userService;

    @RequestMapping("/login")
    public UnifyResponseVO<UserDO> login(@RequestBody LoginDTO dto) throws Exception {
        //调用service层
        UnifyResponseVO<UserDO> userDOUnifyResponseVO = userService.checkLogin(dto);
        return userDOUnifyResponseVO;
    }


//    public String login(@RequestParam String nickName) {
//        System.out.println(nickName);
////        System.out.println(gender);
//        return null;
//    }

}
