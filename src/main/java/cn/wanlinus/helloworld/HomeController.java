package cn.wanlinus.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanli
 * @date 2018-09-28
 */
@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("")
    public String sad() {
        return "OK";
    }

    @GetMapping("a")
    public String dd() {
        logger.info("a");
        return "a OKdsad";
    }
}
