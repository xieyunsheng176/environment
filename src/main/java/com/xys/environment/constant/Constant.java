/*
 * Copyright 2018-2022 feihe.com All right reserved.
 * This software is the confidential and proprietary information of feihe.com ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with feihe.com.
 */
package com.xys.environment.constant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * TODO 请填写类描述
 *
 * @author xieyunsheng
 * @description
 * @date 2022/11/23 12:40
 */
@Component
@Data
@RefreshScope
public class Constant {
//    @Value("${easy.test}")
//    @NacosValue(value = "${easy.test}" , autoRefreshed = true)
    private String test;

}