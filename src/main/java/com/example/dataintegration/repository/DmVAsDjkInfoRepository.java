package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVAsDjkInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DmVAsDjkInfoRepository extends JpaRepository<DmVAsDjkInfo,Integer>, Serializable {
    List<DmVAsDjkInfo> findAllByUid(String uid);

    DmVAsDjkInfo getDmVAsDjkInfoByUid(String uid);

    @Query(nativeQuery = true,value = "select dm_v_as_djk_info.uid as uuid,dm_v_as_djk_info.etl_dt as ddate from " +
            "dm_v_as_djk_info,"+
            "dm_v_as_djkfq_info," +
            "dm_v_tr_contract_mx," +
            "dm_v_tr_djk_mx," +
            "dm_v_tr_dsf_mx," +
            "dm_v_tr_duebill_mx," +
            "dm_v_tr_etc_mx," +
            "dm_v_tr_grwy_mx," +
            "dm_v_tr_gzdf_mx," +
            "dm_v_tr_huanb_mx," +
            "dm_v_tr_huanx_mx," +
            "dm_v_tr_sa_mx," +
            "dm_v_tr_sbyb_mx," +
            "dm_v_tr_sdrq_mx," +
            "dm_v_tr_shop_mx," +
            "dm_v_tr_sjyh_mx " +
            "where " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_contract_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_djk_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_dsf_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_duebill_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_etc_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_grwy_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_gzdf_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_huanb_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_huanx_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_sa_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_sbyb_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_sdrq_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_shop_mx.uid and " +
            "dm_v_as_djkfq_info.uid=dm_v_tr_sjyh_mx.uid and " +

            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_contract_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_djk_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_dsf_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_duebill_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_etc_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_grwy_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_gzdf_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_huanb_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_huanx_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_sa_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_sbyb_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_sdrq_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_shop_mx.etl_dt and " +
            "dm_v_as_djkfq_info.etl_dt=dm_v_tr_sjyh_mx.etl_dt " +
            "group by uuid,ddate order by " +
            "sum(dm_v_as_djkfq_info.mth_instl" +
            "+dm_v_tr_contract_mx.buss_amt" +
            "+dm_v_tr_djk_mx.tran_amt" +
            "+dm_v_tr_dsf_mx.tran_amt" +
            "+dm_v_tr_duebill_mx.buss_amt" +
            "+dm_v_tr_etc_mx.real_amt" +
            "+dm_v_tr_grwy_mx.tran_amt" +
            "+dm_v_tr_gzdf_mx.tran_amt" +
            "+dm_v_tr_huanb_mx.tran_amt" +
            "+dm_v_tr_huanx_mx.tran_amt" +
            "+dm_v_tr_sa_mx.tran_amt" +
            "+dm_v_tr_sbyb_mx.tran_amt_fen" +
            "+dm_v_tr_sdrq_mx.tran_amt_fen" +
            "+dm_v_tr_shop_mx.tran_amt" +
            "+dm_v_tr_sjyh_mx.tran_amt" +
            ") desc")
    List<Map<String,String>> findTop();
}
