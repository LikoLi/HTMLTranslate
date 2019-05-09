package org.liko.project.htmltranslate.controller;

import com.alibaba.fastjson.JSONObject;
import org.liko.project.htmltranslate.util.HttpGet;
import org.liko.project.htmltranslate.util.TransApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    @ResponseBody
    public String translate(@RequestParam("url") String url) {
        String content = HttpGet.get(url, null);
        System.out.println(content);

        String transResult = api.getTransResult(content, "auto", "en");
        System.out.println(transResult);

        JSONObject trans = JSONObject.parseObject(transResult);
        System.out.println(trans.get("trans_result"));
        return transResult;
    }

    public static void main(String[] args) {
        String str = "{\"from\":\"en\",\"to\":\"en\",\"trans_result\":[{\"src\":\"<!DOCTYPE html><!--STATUS OK--><html> <head><meta http-equiv=content-type content=text\\/html;charset=utf-8><meta http-equiv=X-UA-Compatible content=IE=Edge><meta content=always name=referrer><link rel=stylesheet type=text\\/css href=http:\\/\\/s1.bdstatic.com\\/r\\/www\\/cache\\/bdorz\\/baidu.min.css><title>\\u767e\\u5ea6\\u4e00\\u4e0b\\uff0c\\u4f60\\u5c31\\u77e5\\u9053<\\/title><\\/head> <body link=#0000cc> <div id=wrapper> <div id=head> <div class=head_wrapper> <div class=s_form> <div class=s_form_wrapper> <div id=lg> <img hidefocus=true src=\\/\\/www.baidu.com\\/img\\/bd_logo1.png width=270 height=129> <\\/div> <form id=form name=f action=\\/\\/www.baidu.com\\/s class=fm> <input type=hidden name=bdorz_come value=1> <input type=hidden name=ie value=utf-8> <input type=hidden name=f value=8> <input type=hidden name=rsv_bp value=1> <input type=hidden name=rsv_idx value=1> <input type=hidden name=tn value=baidu><span class=\\\"bg s_ipt_wr\\\"><input id=kw name=wd class=s_ipt value maxlength=255 autocomplete=off autofocus><\\/span><span class=\\\"bg s_btn_wr\\\"><input type=submit id=su value=\\u767e\\u5ea6\\u4e00\\u4e0b class=\\\"bg s_btn\\\"><\\/span> <\\/form> <\\/div> <\\/div> <div id=u1> <a href=http:\\/\\/news.baidu.com name=tj_trnews class=mnav>\\u65b0\\u95fb<\\/a> <a href=http:\\/\\/www.hao123.com name=tj_trhao123 class=mnav>hao123<\\/a> <a href=http:\\/\\/map.baidu.com name=tj_trmap class=mnav>\\u5730\\u56fe<\\/a> <a href=http:\\/\\/v.baidu.com name=tj_trvideo class=mnav>\\u89c6\\u9891<\\/a> <a href=http:\\/\\/tieba.baidu.com name=tj_trtieba class=mnav>\\u8d34\\u5427<\\/a> <noscript> <a href=http:\\/\\/www.baidu.com\\/bdorz\\/login.gif?login&amp;tpl=mn&amp;u=http%3A%2F%2Fwww.baidu.com%2f%3fbdorz_come%3d1 name=tj_login class=lb>\\u767b\\u5f55<\\/a> <\\/noscript> <script>document.write('<a href=\\\"http:\\/\\/www.baidu.com\\/bdorz\\/login.gif?login&tpl=mn&u='+ encodeURIComponent(window.location.href+ (window.location.search === \\\"\\\" ? \\\"?\\\" : \\\"&\\\")+ \\\"bdorz_come=1\\\")+ '\\\" name=\\\"tj_login\\\" class=\\\"lb\\\">\\u767b\\u5f55<\\/a>');<\\/script> <a href=\\/\\/www.baidu.com\\/more\\/ name=tj_briicon class=bri style=\\\"display: block;\\\">\\u66f4\\u591a\\u4ea7\\u54c1<\\/a> <\\/div> <\\/div> <\\/div> <div id=ftCon> <div id=ftConw> <p id=lh> <a href=http:\\/\\/home.baidu.com>\\u5173\\u4e8e\\u767e\\u5ea6<\\/a> <a href=http:\\/\\/ir.baidu.com>About Baidu<\\/a> <\\/p> <p id=cp>&copy;2017&nbsp;Baidu&nbsp;<a href=http:\\/\\/www.baidu.com\\/duty\\/>\\u4f7f\\u7528\\u767e\\u5ea6\\u524d\\u5fc5\\u8bfb<\\/a>&nbsp; <a href=http:\\/\\/jianyi.baidu.com\\/ class=cp-feedback>\\u610f\\u89c1\\u53cd\\u9988<\\/a>&nbsp;\\u4eacICP\\u8bc1030173\\u53f7&nbsp; <img src=\\/\\/www.baidu.com\\/img\\/gs.gif> <\\/p> <\\/div> <\\/div> <\\/div> <\\/body> <\\/html>\",\"dst\":\"<!DOCTYPE html><!--STATUS OK--><html> <head><meta http-equiv=content-type content=text\\/html;charset=utf-8><meta http-equiv=X-UA-Compatible content=IE=Edge><meta content=always name=referrer><link rel=stylesheet type=text\\/css href=http:\\/\\/s1.bdstatic.com\\/r\\/www\\/cache\\/bdorz\\/baidu.min.css><title>\\u767e\\u5ea6\\u4e00\\u4e0b\\uff0c\\u4f60\\u5c31\\u77e5\\u9053<\\/title><\\/head> <body link=#0000cc> <div id=wrapper> <div id=head> <div class=head_wrapper> <div class=s_form> <div class=s_form_wrapper> <div id=lg> <img hidefocus=true src=\\/\\/www.baidu.com\\/img\\/bd_logo1.png width=270 height=129> <\\/div> <form id=form name=f action=\\/\\/www.baidu.com\\/s class=fm> <input type=hidden name=bdorz_come value=1> <input type=hidden name=ie value=utf-8> <input type=hidden name=f value=8> <input type=hidden name=rsv_bp value=1> <input type=hidden name=rsv_idx value=1> <input type=hidden name=tn value=baidu><span class=\\\"bg s_ipt_wr\\\"><input id=kw name=wd class=s_ipt value maxlength=255 autocomplete=off autofocus><\\/span><span class=\\\"bg s_btn_wr\\\"><input type=submit id=su value=\\u767e\\u5ea6\\u4e00\\u4e0b class=\\\"bg s_btn\\\"><\\/span> <\\/form> <\\/div> <\\/div> <div id=u1> <a href=http:\\/\\/news.baidu.com name=tj_trnews class=mnav>\\u65b0\\u95fb<\\/a> <a href=http:\\/\\/www.hao123.com name=tj_trhao123 class=mnav>hao123<\\/a> <a href=http:\\/\\/map.baidu.com name=tj_trmap class=mnav>\\u5730\\u56fe<\\/a> <a href=http:\\/\\/v.baidu.com name=tj_trvideo class=mnav>\\u89c6\\u9891<\\/a> <a href=http:\\/\\/tieba.baidu.com name=tj_trtieba class=mnav>\\u8d34\\u5427<\\/a> <noscript> <a href=http:\\/\\/www.baidu.com\\/bdorz\\/login.gif?login&amp;tpl=mn&amp;u=http%3A%2F%2Fwww.baidu.com%2f%3fbdorz_come%3d1 name=tj_login class=lb>\\u767b\\u5f55<\\/a> <\\/noscript> <script>document.write('<a href=\\\"http:\\/\\/www.baidu.com\\/bdorz\\/login.gif?login&tpl=mn&u='+ encodeURIComponent(window.location.href+ (window.location.search === \\\"\\\" ? \\\"?\\\" : \\\"&\\\")+ \\\"bdorz_come=1\\\")+ '\\\" name=\\\"tj_login\\\" class=\\\"lb\\\">\\u767b\\u5f55<\\/a>');<\\/script> <a href=\\/\\/www.baidu.com\\/more\\/ name=tj_briicon class=bri style=\\\"display: block;\\\">\\u66f4\\u591a\\u4ea7\\u54c1<\\/a> <\\/div> <\\/div> <\\/div> <div id=ftCon> <div id=ftConw> <p id=lh> <a href=http:\\/\\/home.baidu.com>\\u5173\\u4e8e\\u767e\\u5ea6<\\/a> <a href=http:\\/\\/ir.baidu.com>About Baidu<\\/a> <\\/p> <p id=cp>&copy;2017&nbsp;Baidu&nbsp;<a href=http:\\/\\/www.baidu.com\\/duty\\/>\\u4f7f\\u7528\\u767e\\u5ea6\\u524d\\u5fc5\\u8bfb<\\/a>&nbsp; <a href=http:\\/\\/jianyi.baidu.com\\/ class=cp-feedback>\\u610f\\u89c1\\u53cd\\u9988<\\/a>&nbsp;\\u4eacICP\\u8bc1030173\\u53f7&nbsp; <img src=\\/\\/www.baidu.com\\/img\\/gs.gif> <\\/p> <\\/div> <\\/div> <\\/div> <\\/body> <\\/html>\"}]}";
        JSONObject trans = JSONObject.parseObject(str);
    }
}
