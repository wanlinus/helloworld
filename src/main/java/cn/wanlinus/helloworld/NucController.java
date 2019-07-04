package cn.wanlinus.helloworld;

import cn.wanlinus.helloworld.nuc.*;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * @author wanli
 * @date 2019-07-03 09:57
 */
@RestController
public class NucController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NucController.class);
    public static final int TOTAL_STAFF_ITEMS = 10000;
    public static final int TOTAL_UNIT_ITEMS = 2000;

    @PostMapping("LoginApp/v1/login")
    public NucResponse<NucLoginRes> login(NucLoginReq login, HttpServletRequest request) {
        LOGGER.info("LoginApp/v1/login - {}", JSON.toJSONString(login));
        LOGGER.info("LoginApp/v1/login request - {}", request.getHeader("Authorization"));
        LOGGER.info("LoginApp/v1/login CallerModule - {}", request.getHeader("CallerModule"));

        NucResponse<NucLoginRes> response = null;

        if (new Random().nextInt(10) > 5) {
            response = new NucResponse<>(true, "success");
            NucLoginRes loginRes = new NucLoginRes("xiaom001", "小米",
                    "500167b0aedc27ac348ca6f93a70dcfc70859d88f6f1dcb080a2a8199e709773a893d9e86a6948ec27d6400b469c54a07a9a");
            response.setData(loginRes);
        } else {
            response = new NucResponse<>(false, "你猜为什么不给你登陆");
            NucLoginRes loginRes = new NucLoginRes();
            loginRes.setImageCodeVerifyRequired(true);
            loginRes.setErrorTimes(3);
            response.setData(loginRes);
        }
        return response;
    }

    @GetMapping(value = "/VerifyCodeImage.jpg", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] image(HttpServletResponse response) throws IOException {
        LOGGER.info("VerifyCodeImage");

        File file = new File("cc.png");
        byte[] bytes;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, inputStream.available());
        }
        response.setHeader("imageUUID", "12345");
        return bytes;
    }

    @PostMapping("/nuc-api/v1/listBusinessUnit")
    public NucResponseV2<NucPagation<NucBusinessUnitRes>> listBusinessUnit(@RequestBody NucBusinessUnitReq req) {
        LOGGER.debug("NucBusinessUnitReq - {}", JSON.toJSONString(req));


        int totalPage = (TOTAL_UNIT_ITEMS - 1) / req.getPageSize() + 1;

        int size;
        if (req.getCurrentPage() == totalPage) {
            size = TOTAL_UNIT_ITEMS % req.getPageSize();
        } else {
            size = req.getPageSize();
        }

        LOGGER.debug("request size {}", size);

        List<NucBusinessUnitRes> list = new ArrayList<>(1200);

        for (int i = 0; i < size; i++) {
            NucBusinessUnitRes res = new NucBusinessUnitRes(
                    "招商局金融集团有限公司" + (i + (req.getCurrentPage() - 1) * req.getPageSize()),
                    "招商局金融科技有限公司" + (i + (req.getCurrentPage() - 1) * req.getPageSize()), "Y",
                    1550816018000L, "CMFT", "WANLI", 1511190240000L,
                    "B", new HashMap<>(4), "周益", "sadsad");
            list.add(res);
        }

        NucPagation<NucBusinessUnitRes> pagation = new NucPagation<>(TOTAL_UNIT_ITEMS, 1, req.getCurrentPage() == 1,
                req.getCurrentPage() == totalPage, totalPage, req.getPageSize(), 1, 1, req.getCurrentPage(), list);


        NucResponseV2<NucPagation<NucBusinessUnitRes>> responseV2 = new NucResponseV2<>("1", "success");
        responseV2.setData(pagation);

        return responseV2;
    }

    @PostMapping("/nuc-api/v1/getBusinessUnitInfo")
    public NucResponseV2<NucBusinessUnitInfoRes> getBusinessUnitInfo(BusinessUnitInfoReq req) {
        LOGGER.info("BusinessUnitInfoReq: [{}]", JSON.toJSONString(req));
        NucResponseV2<NucBusinessUnitInfoRes> responseV2 = new NucResponseV2<>("1", "success");
        NucBusinessUnitInfoRes info = new NucBusinessUnitInfoRes(new HashMap<>(4), "CMHK",
                "招商局金融科技", "CMFT", "招商局金融集团", "C");
        responseV2.setData(info);
        return responseV2;
    }

    @PostMapping("/nuc-api/v1/listBuStaff")
    public NucResponseV2<NucPagation<NucBuStaffRes>> listBuStaff(@RequestBody NucBuStaffReq req, HttpServletRequest request) {
        LOGGER.info("listBuStaff - [{}]", JSON.toJSONString(req));
        LOGGER.info("auth {}", request.getHeader(HttpHeaders.AUTHORIZATION));

        NucResponseV2<NucPagation<NucBuStaffRes>> responseV2 = new NucResponseV2<>("1", "success");
        List<NucStaffOrganize> list = new ArrayList<>();
        list.add(new NucStaffOrganize("歪耳巴子科技有限公司", "保险系统开发部", "招商金科方案保险系统开发助理工程师", "200000440",
                "1000110", req.getBusinessUnit(), "10013084", "1000105", "D"));


        List<NucBuStaffRes> resList = new ArrayList<>();
        LOGGER.debug("page size {}", req.getPageSize());
        int totalPage = (TOTAL_STAFF_ITEMS - 1) / req.getPageSize() + 1;

        int size;
        if (req.getCurrentPage() == totalPage) {
            size = TOTAL_STAFF_ITEMS % req.getPageSize();
        } else {
            size = req.getPageSize();
        }

        LOGGER.debug("request size {}", size);

        for (int i = 0; i < size; i++) {
            Map<String, Object> map = new HashMap<>(4);
            map.put("EMAIL", "test" + (i + size) + "@wise2c.com");
            NucBuStaffRes res = new NucBuStaffRes("招商局金融科技有限公司", 648399600000L, "200000440", "M", "CMFT",
                    "a779ed92-0470-4bf3-a1ef-12cc5151ba47", 1499184000000L, list,
                    "liuxh00" + (i + (req.getCurrentPage() - 1) * req.getPageSize()),
                    "刘旭辉" + (i + (req.getCurrentPage() - 1) * req.getPageSize()),
                    1522080000000L, map, "INNER");
            resList.add(res);
        }

        NucPagation<NucBuStaffRes> pagation = new NucPagation<>(TOTAL_STAFF_ITEMS, 1, req.getCurrentPage() == 1,
                req.getCurrentPage() == totalPage, totalPage, req.getPageSize(), size, 1, req.getCurrentPage(), resList);

        responseV2.setData(pagation);
        return responseV2;
    }
}
