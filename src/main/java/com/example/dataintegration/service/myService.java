package com.example.dataintegration.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface myService {
    JSONObject getConsumeAmt(String uid);

    JSONObject getTop20Cst(String mode);
}
