package com.example.dataintegration.serviceImpl;

import com.example.dataintegration.repository.*;
import com.example.dataintegration.service.myService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class serviceImpl implements myService {
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
}
