package com.example.springboot;

import cn.hutool.core.date.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rundreams.blog.csdn.net
 *
 * @Time 2023/2/24
 * @Author Zhang Zihao
 * @description:
 */
@RestController
public class TokenController {

    @GetMapping(value = "times")
    public Object times() {
        return DateUtil.now();
    }
}
