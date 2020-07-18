package com.uestc.mall.service;

import com.uestc.mall.common.api.CommonResult;

public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号是否匹配
     */
    CommonResult verifyAuthCode(String telephone,String authCode);
}
