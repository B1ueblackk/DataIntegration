package com.example.dataintegration.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.dataintegration.entity.DmVAsDjkInfo;
import com.example.dataintegration.entity.DmVAsDjkfqInfo;
import com.example.dataintegration.entity.DmVTrContractMx;
import com.example.dataintegration.repository.*;
import com.example.dataintegration.service.myService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Service
public class serviceImpl implements myService {
    Map<String,BigDecimal> amt = new HashMap<>();
    @Autowired
    private DmVAsDjkfqInfoRepository dmVAsDjkfqInfoRepository;
    @Autowired
    private DmVAsDjkInfoRepository dmVAsDjkInfoRepository;
    @Autowired
    private DmVTrContractMxRepository dmVTrContractMxRepository;
    @Autowired
    private DmVTrDjkMxRepository dmVTrDjkMxRepository;
    @Autowired
    private DmVTrDsfMxRepository dmVTrDsfMxRepository;
    @Autowired
    private DmVTrDuebillMxRepository dmVTrDuebillMxRepository;
    @Autowired
    private DmVTrEtcMxRepository dmVTrEtcMxRepository;
    @Autowired
    private DmVTrGrwyMxRepository dmVTrGrwyMxRepository;
    @Autowired
    private DmVTrGzdfMxRepository dmVTrGzdfMxRepository;
    @Autowired
    private DmVTrHuanbMxRepository dmVTrHuanbMxRepository;
    @Autowired
    private DmVTrHuanxMxRepository dmVTrHuanxMxRepository;
    @Autowired
    private DmVTrSaMxRepository dmVTrSaMxRepository;
    @Autowired
    private DmVTrSbybMxRepository dmVTrSbybMxRepository;
    @Autowired
    private DmVTrSdrqMxRepository dmVTrSdrqMxRepository;
    @Autowired
    private DmVTrShopMxRepository dmVTrShopMxRepository;
    @Autowired
    private DmVTrSjyhMxRepository dmVTrSjyhMxRepository;
    @Autowired
    private PriCreditInfoRepository priCreditInfoRepository;
    @Autowired
    private PriCustAssetAcctInfoRepository priCustAssetAcctInfoRepository;
    @Autowired
    private PriCustAssetInfoRepository priCustAssetInfoRepository;
    @Autowired
    private PriCustBaseInfoRepository priCustBaseInfoRepository;
    @Autowired
    private PriCustLiabAcctInfoRepository priCustLiabAcctInfoRepository;
    @Autowired
    private PriCustLiabInfoRepository priCustLiabInfoRepository;
    @Autowired
    private PriStarInfoRepository priStarInfoRepository;

    @Override
    public JSONObject getConsumeAmt(String uid) {
        JSONObject jsonObject = new JSONObject();
        List<Map<Object,Object>> djkfqInfoRepositoryAmt = dmVAsDjkfqInfoRepository.findAmt(uid);
        List<Map<Object, Object>> djkMxRepositoryAmt = dmVTrDjkMxRepository.findAmt(uid);
        List<Map<Object, Object>> contractMxRepositoryAmt = dmVTrContractMxRepository.findAmt(uid);
        List<Map<Object, Object>> dsfMxRepositoryAmt = dmVTrDsfMxRepository.findAmt(uid);
        List<Map<Object, Object>> duebillMxRepositoryAmt = dmVTrDuebillMxRepository.findAmt(uid);
        List<Map<Object, Object>> etcMxRepositoryAmt = dmVTrEtcMxRepository.findAmt(uid);
        List<Map<Object, Object>> grwyMxRepositoryAmt = dmVTrGrwyMxRepository.findAmt(uid);
        List<Map<Object, Object>> gzdfMxRepositoryAmt = dmVTrGzdfMxRepository.findAmt(uid);
        List<Map<Object, Object>> huanbMxRepositoryAmt = dmVTrHuanbMxRepository.findAmt(uid);
        List<Map<Object, Object>> huanxMxRepositoryAmt = dmVTrHuanxMxRepository.findAmt(uid);
        List<Map<Object, Object>> saMxRepositoryAmt = dmVTrSaMxRepository.findAmt(uid);
        List<Map<Object, Object>> sbybMxRepositoryAmt = dmVTrSbybMxRepository.findAmt(uid);
        List<Map<Object, Object>> sdrqMxRepositoryAmt = dmVTrSdrqMxRepository.findAmt(uid);
        List<Map<Object, Object>> shopMxRepositoryAmt = dmVTrShopMxRepository.findAmt(uid);
        List<Map<Object, Object>> sjyhMxRepositoryAmt = dmVTrSjyhMxRepository.findAmt(uid);


        this.amt = new HashMap<>();

        djkfqInfoRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        djkMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        contractMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        dsfMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        duebillMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        etcMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        grwyMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        gzdfMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        huanbMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        huanxMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        saMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        sbybMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        sdrqMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        shopMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });

        sjyhMxRepositoryAmt.forEach(stringBigDecimalMap -> {
            concat(stringBigDecimalMap.get("date"),stringBigDecimalMap.get("sum"));
        });
        Map<String,String> ans = new HashMap<>();
        amt.forEach((s, bigDecimal) -> ans.put(s,bigDecimal.toString()));
        jsonObject.put("amt", ans);
        return jsonObject;
    }

    @Override
    public JSONObject getTop20Cst() {
        List<Map<String, String>> allTop = dmVAsDjkInfoRepository.findTop();
        Map<String,List<String>> ret = new HashMap<>();
        allTop.forEach(stringStringMap -> {
            String uname = dmVAsDjkInfoRepository.getDmVAsDjkInfoByUid(stringStringMap.get("uuid")).getCustName();
            String date = stringStringMap.get("ddate");

            if(ret.containsKey(date)){
                if(ret.get(date).size()<20) ret.get(date).add(uname);
            }
            else ret.put(date,new ArrayList<>());
        });

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("cst",ret);
        return jsonObject;

    }


    private void concat(Object o1,Object o2){
        Map<String, BigDecimal> stringBigDecimalMap = new HashMap<>();
        stringBigDecimalMap.put((String) o1,(BigDecimal) o2);
        amt = Stream.concat(amt.entrySet().stream(), stringBigDecimalMap.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        BigDecimal::add));
    }

}


