package com.xiaoyez.wiki.controller;

import com.xiaoyez.wiki.req.EbookReq;
import com.xiaoyez.wiki.resp.CommonResp;
import com.xiaoyez.wiki.resp.EbookResp;
import com.xiaoyez.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// @Controller 一般返回一个页面
//一般用来返回字符串
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
