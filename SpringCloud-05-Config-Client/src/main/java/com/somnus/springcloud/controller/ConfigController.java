/**
 * <p>Title: ConfigController.java </p>
 * <p>Description: TODO(用一句话描述该文件做什么) </p>
 *
 * @author pc
 * @version 1.0.0
 * @date 2018年9月18日
 */
package com.somnus.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author pc
 * @date 2018年9月18日
 */
@RefreshScope
@RestController
public class ConfigController {

    @Value(value = "${spring.zipkin.base-url}")
    private String url;

    @GetMapping("hi")
    public String hi() {
        return url;
    }

}
