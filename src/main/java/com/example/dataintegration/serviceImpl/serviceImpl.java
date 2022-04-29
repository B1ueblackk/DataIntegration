package com.example.dataintegration.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.dataintegration.repository.*;
import com.example.dataintegration.service.myService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
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
    public JSONObject getTop20Cst(String mode) {
        JSONObject jsonObject = new JSONObject();
        switch (mode){
            case "dm_v_as_djkfq_info":
                jsonObject.put(mode,getTop20(dmVAsDjkfqInfoRepository.findTop()));
                break;
            case "dm_v_tr_contract_mx":
                jsonObject.put(mode,getTop20(dmVTrContractMxRepository.findTop()));
                break;
            case "dm_v_tr_djk_mx":
                jsonObject.put(mode,getTop20(dmVTrDjkMxRepository.findTop()));
                break;
            case "dm_v_tr_dsf_mx":
                jsonObject.put(mode,getTop20(dmVTrDsfMxRepository.findTop()));
                break;
            case "dm_v_tr_duebill_mx":
                jsonObject.put(mode,getTop20(dmVTrDuebillMxRepository.findTop()));
                break;
            case "dm_v_tr_etc_mx":
                jsonObject.put(mode,getTop20(dmVTrEtcMxRepository.findTop()));
                break;
            case "dm_v_tr_grwy_mx":
                jsonObject.put(mode,getTop20(dmVTrGrwyMxRepository.findTop()));
                break;
            case "dm_v_tr_gzdf_mx":
                jsonObject.put(mode,getTop20(dmVTrGzdfMxRepository.findTop()));
                break;
            case "dm_v_tr_huanb_mx":
                jsonObject.put(mode,getTop20(dmVTrHuanbMxRepository.findTop()));
                break;
            case "dm_v_tr_huanx_mx":
                jsonObject.put(mode,getTop20(dmVTrHuanxMxRepository.findTop()));
                break;
            case "dm_v_tr_sa_mx":
                jsonObject.put(mode,getTop20(dmVTrSaMxRepository.findTop()));
                break;
            case "dm_v_tr_sbyb_mx":
                jsonObject.put(mode,getTop20(dmVTrSbybMxRepository.findTop()));
                break;
            case "dm_v_tr_sdrq_mx":
                jsonObject.put(mode,getTop20(dmVTrSdrqMxRepository.findTop()));
                break;
            case "dm_v_tr_shop_mx":
                jsonObject.put(mode,getTop20(dmVTrShopMxRepository.findTop()));
                break;
            case "dm_v_tr_sjyh_mx":
                jsonObject.put(mode,getTop20(dmVTrSjyhMxRepository.findTop()));
                break;
            default:
                break;
        }
        return jsonObject;

    }

    private Map<String,List<String>> getTop20(List<Map<String, String>> data){
        Map<String,List<String>> ret = new HashMap<>();
        data.forEach(stringStringMap -> {
            String uname = stringStringMap.get("uuid");
            String date = stringStringMap.get("ddate");

            if(ret.containsKey(date)){
                if(ret.get(date).size()<20){
                    if(!ret.get(date).contains(uname)){
                        ret.get(date).add(uname);
                    }
                }
            }
            else {
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(uname);
                ret.put(date,tmp);
            };
        });

        return ret;
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


