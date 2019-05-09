package org.liko.project.htmltranslate.controller;

import com.alibaba.fastjson.JSONObject;
import org.liko.project.htmltranslate.util.HttpGet;
import org.liko.project.htmltranslate.util.TransApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author liko
 * @Date 2019/5/9
 * @Version 1.0
 * @Description TODO
 */
@Controller
public class HTMLTranslateController {

    @Autowired
    private TransApi api;

    @RequestMapping("/translate")
    public String translate(@RequestParam("url") String url, ModelMap map) {
        String content = HttpGet.get(url, null);

        String transResult = api.getTransResult(content, "auto", "zh");

        JSONObject trans = JSONObject.parseObject(transResult);
        transResult = trans.getJSONArray("trans_result").getJSONObject(0).get("dst").toString();
        map.put("transResult", transResult);
        return "content";
    }

    @RequestMapping("/translate/zh")
    public String translateToZH(@RequestParam("word") String word, ModelMap map) {
        String transResult = api.getTransResult(word, "auto", "zh");

        JSONObject trans = JSONObject.parseObject(transResult);
        transResult = trans.getJSONArray("trans_result").getJSONObject(0).get("dst").toString();
        map.put("transResult", transResult);
        return "content";
    }

    @RequestMapping("/translate/en")
    public String translateToEN(@RequestParam("word") String word, ModelMap map) {
        String transResult = api.getTransResult(word, "auto", "en");

        JSONObject trans = JSONObject.parseObject(transResult);
        transResult = trans.getJSONArray("trans_result").getJSONObject(0).get("dst").toString();

        map.put("transResult", transResult);
        return "content";
    }
}
