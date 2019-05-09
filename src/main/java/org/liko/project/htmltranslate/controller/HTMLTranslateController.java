package org.liko.project.htmltranslate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author liko
 * @Date 2019/5/9
 * @Version 1.0
 * @Description TODO
 */
@Controller
public class HTMLTranslateController {

    @RequestMapping("/translate")
    public String translate(@RequestParam("url") String url) {
        System.out.println(url);
        return "success";
    }
}
