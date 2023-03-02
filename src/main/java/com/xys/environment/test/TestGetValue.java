/*
 * Copyright 2018-2022 feihe.com All right reserved.
 * This software is the confidential and proprietary information of feihe.com ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with feihe.com.
 */
package com.xys.environment.test;

import com.xys.environment.constant.Constant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO 请填写类描述
 *
 * @author xieyunsheng
 * @description
 * @date 2022/11/23 12:05
 */
@RestController
@RefreshScope
public class TestGetValue {

    @Resource
    private Constant constant;

//    @Value("${easy.test}")
//    @NacosValue(value = "${easy.test}" , autoRefreshed = true)
    private String test;

    @RequestMapping("getValue")
    public String getValue() {
        return test;
    }
}