package cn.wanlinus.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author wanli
 * @date 2018-09-28
 */
@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("")
    public String sad(HttpServletRequest request) {
        return "OK" + request.getSession().getId();
    }

    @GetMapping(value = "image", produces = "image/jpeg")
    public byte[] getImage() throws IOException {
        File file = new File("cc.jpg");
        byte[] bytes;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, inputStream.available());
        }
        return bytes;
    }

}
