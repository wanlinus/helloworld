package cn.wanlinus.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanli
 * @date 2018-09-28
 */
@RestController
public class HomeController {
    @GetMapping("")
    public String sad() {
        return "OK";
    }
    @GetMapping("a")
    public String dd(){
        return "a OK";
    }
}
