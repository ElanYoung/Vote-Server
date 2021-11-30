package com.starimmortal.vote.controller.v1;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.starimmortal.vote.common.util.RestUtil;
import com.starimmortal.vote.dto.LoginDTO;
import com.starimmortal.vote.mapper.UserMapper;
import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.service.impl.UserServiceImpl;
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
    UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(@RequestBody LoginDTO dto) throws Exception {
        //调用接口提取工具类
        RestUtil restUtil = new RestUtil();
        //通过code获取想要的openid和sessionKey
        String resultString = restUtil.load("https://api.weixin.qq.com/sns/jscode2session?appid=wxef2fe548162e3a02&secret=a0880a9a13ad24b5b080e42d943427bd&" +
                "js_code=" + dto.getCode() + "&grant_type=authorization_code");
        //得到接口数据，将其转换为json对象（map）
        JSONObject jsonObject = JSONObject.parseObject(resultString);
        //通过key值获取
        dto.setOpenid(jsonObject.getString("openid"));
        dto.setSessionKey(jsonObject.getString("session_key"));
        UserDO userDO = new UserDO();
        //将dto赋值给实体类
        BeanUtils.copyProperties(dto, userDO);
        userDO.setWxProfile(JSON.toJSONString(dto.getWxProfile()));
        System.out.println("userDo:" + userDO);
        if (userService.selectByOpenid(userDO.getOpenid())!=null) {
            return "success";
        }
        //如果表中不含有该id，我们就添加入数据库
        else {
            int num = userService.getBaseMapper().insert(userDO);
            return num > 0 ? "success" : "error";
        }
    }


//    public String login(@RequestParam String nickName) {
//        System.out.println(nickName);
////        System.out.println(gender);
//        return null;
//    }

}
