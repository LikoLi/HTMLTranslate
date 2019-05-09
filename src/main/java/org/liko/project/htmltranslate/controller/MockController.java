package org.liko.project.htmltranslate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MockController {

    @RequestMapping("/apple")
    @ResponseBody
    public String apple() {
        return "苹果";
    }
}
