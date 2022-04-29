package com.example.dataintegration.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.dataintegration.service.myService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
public class myController {
    @Resource
    private myService _myService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @ResponseBody
    @PostMapping("/getConsumeAmt")
    public JSONObject getConsumeAmt(String uid){
        return _myService.getConsumeAmt(uid);
    }

    @ResponseBody
    @PostMapping("/getTop20Cst")
    public JSONObject getTop20Cst(String mode){
        return _myService.getTop20Cst(mode);
    }
}
