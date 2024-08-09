package consumer.member.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class Coverage {

    @SerializedName("cumb_id_no")
    @Expose
    private Integer cumbIdNo;
    @SerializedName("acmbrh_eff_dt")
    @Expose
    private LocalDate acmbrhEffDt;
    @SerializedName("acmbrh_srcpstd_dt")
    @Expose
    private String acmbrhSrcpstdDt;
    @SerializedName("acmbrh_cov_sts_cd")
    @Expose
    private Integer acmbrhCovStsCd;
    @SerializedName("acmbrh_clmoff_cd")
    @Expose
    private Integer acmbrhClmoffCd;
    @SerializedName("acmbrh_exprtn_dt")
    @Expose
    private String acmbrhExprtnDt;
    @SerializedName("acmbrh_dtsrc_cd")
    @Expose
    private String acmbrhDtsrcCd;
    @SerializedName("acmbrh_ty_cd")
    @Expose
    private String acmbrhTyCd;
    @SerializedName("acmbrh_vrblcvg_ind")
    @Expose
    private String acmbrhVrblcvgInd;
    @SerializedName("pspp_plan_no")
    @Expose
    private Integer psppPlanNo;
    @SerializedName("pspp_plnsmry_cd")
    @Expose
    private String psppPlnsmryCd;
    @SerializedName("enrlh_emplmtsts_cd")
    @Expose
    private String enrlhEmplmtstsCd;
    @SerializedName("enrlh_cvdpexsp_cnt")
    @Expose
    private Integer enrlhCvdpexspCnt;
    @SerializedName("enrlh_sps_cov_cd")
    @Expose
    private String enrlhSpsCovCd;
    @SerializedName("enrlh_deps_cov_cd")
    @Expose
    private Integer enrlhDepsCovCd;
    @SerializedName("ctl_no")
    @Expose
    private Integer ctlNo;
    @SerializedName("sfx_no")
    @Expose
    private Integer sfxNo;
    @SerializedName("acct_no")
    @Expose
    private Integer acctNo;
    @SerializedName("grp_cd")
    @Expose
    private String grpCd;
    @SerializedName("site_cd")
    @Expose
    private String siteCd;
    @SerializedName("sbgrp_cd")
    @Expose
    private String sbgrpCd;
    @SerializedName("acmbrh_uncnfrm_ind")
    @Expose
    private String acmbrhUncnfrmInd;
    @SerializedName("acmbrh_uncnfrrs_cd")
    @Expose
    private String acmbrhUncnfrrsCd;
    @SerializedName("enrlh_spscvgsrc_cd")
    @Expose
    private String enrlhSpscvgsrcCd;
    @SerializedName("enrlh_xcdgspsrc_cd")
    @Expose
    private String enrlhXcdgspsrcCd;
    @SerializedName("acmbrh_seccvgst_cd")
    @Expose
    private Integer acmbrhSeccvgstCd;
    @SerializedName("acmbrh_cocevent_dt")
    @Expose
    private String acmbrhCoceventDt;
    @SerializedName("acmbrh_cocexp_dt")
    @Expose
    private String acmbrhCocexpDt;
    @SerializedName("acmbrh_cocpdmo_cnt")
    @Expose
    private Integer acmbrhCocpdmoCnt;
    @SerializedName("stsrsn_cd")
    @Expose
    private String stsrsnCd;

    public Integer getCumbIdNo() {
        return cumbIdNo;
    }

    public void setCumbIdNo(Integer cumbIdNo) {
        this.cumbIdNo = cumbIdNo;
    }

    public LocalDate getAcmbrhEffDt() {
        return acmbrhEffDt;
    }

    public void setAcmbrhEffDt(LocalDate acmbrhEffDt) {
        this.acmbrhEffDt = acmbrhEffDt;
    }

    public String getAcmbrhSrcpstdDt() {
        return acmbrhSrcpstdDt;
    }

    public void setAcmbrhSrcpstdDt(String acmbrhSrcpstdDt) {
        this.acmbrhSrcpstdDt = acmbrhSrcpstdDt;
    }

    public Integer getAcmbrhCovStsCd() {
        return acmbrhCovStsCd;
    }

    public void setAcmbrhCovStsCd(Integer acmbrhCovStsCd) {
        this.acmbrhCovStsCd = acmbrhCovStsCd;
    }

    public Integer getAcmbrhClmoffCd() {
        return acmbrhClmoffCd;
    }

    public void setAcmbrhClmoffCd(Integer acmbrhClmoffCd) {
        this.acmbrhClmoffCd = acmbrhClmoffCd;
    }

    public String getAcmbrhExprtnDt() {
        return acmbrhExprtnDt;
    }

    public void setAcmbrhExprtnDt(String acmbrhExprtnDt) {
        this.acmbrhExprtnDt = acmbrhExprtnDt;
    }

    public String getAcmbrhDtsrcCd() {
        return acmbrhDtsrcCd;
    }

    public void setAcmbrhDtsrcCd(String acmbrhDtsrcCd) {
        this.acmbrhDtsrcCd = acmbrhDtsrcCd;
    }

    public String getAcmbrhTyCd() {
        return acmbrhTyCd;
    }

    public void setAcmbrhTyCd(String acmbrhTyCd) {
        this.acmbrhTyCd = acmbrhTyCd;
    }

    public String getAcmbrhVrblcvgInd() {
        return acmbrhVrblcvgInd;
    }

    public void setAcmbrhVrblcvgInd(String acmbrhVrblcvgInd) {
        this.acmbrhVrblcvgInd = acmbrhVrblcvgInd;
    }

    public Integer getPsppPlanNo() {
        return psppPlanNo;
    }

    public void setPsppPlanNo(Integer psppPlanNo) {
        this.psppPlanNo = psppPlanNo;
    }

    public String getPsppPlnsmryCd() {
        return psppPlnsmryCd;
    }

    public void setPsppPlnsmryCd(String psppPlnsmryCd) {
        this.psppPlnsmryCd = psppPlnsmryCd;
    }

    public String getEnrlhEmplmtstsCd() {
        return enrlhEmplmtstsCd;
    }

    public void setEnrlhEmplmtstsCd(String enrlhEmplmtstsCd) {
        this.enrlhEmplmtstsCd = enrlhEmplmtstsCd;
    }

    public Integer getEnrlhCvdpexspCnt() {
        return enrlhCvdpexspCnt;
    }

    public void setEnrlhCvdpexspCnt(Integer enrlhCvdpexspCnt) {
        this.enrlhCvdpexspCnt = enrlhCvdpexspCnt;
    }

    public String getEnrlhSpsCovCd() {
        return enrlhSpsCovCd;
    }

    public void setEnrlhSpsCovCd(String enrlhSpsCovCd) {
        this.enrlhSpsCovCd = enrlhSpsCovCd;
    }

    public Integer getEnrlhDepsCovCd() {
        return enrlhDepsCovCd;
    }

    public void setEnrlhDepsCovCd(Integer enrlhDepsCovCd) {
        this.enrlhDepsCovCd = enrlhDepsCovCd;
    }

    public Integer getCtlNo() {
        return ctlNo;
    }

    public void setCtlNo(Integer ctlNo) {
        this.ctlNo = ctlNo;
    }

    public Integer getSfxNo() {
        return sfxNo;
    }

    public void setSfxNo(Integer sfxNo) {
        this.sfxNo = sfxNo;
    }

    public Integer getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Integer acctNo) {
        this.acctNo = acctNo;
    }

    public String getGrpCd() {
        return grpCd;
    }

    public void setGrpCd(String grpCd) {
        this.grpCd = grpCd;
    }

    public String getSiteCd() {
        return siteCd;
    }

    public void setSiteCd(String siteCd) {
        this.siteCd = siteCd;
    }

    public String getSbgrpCd() {
        return sbgrpCd;
    }

    public void setSbgrpCd(String sbgrpCd) {
        this.sbgrpCd = sbgrpCd;
    }

    public String getAcmbrhUncnfrmInd() {
        return acmbrhUncnfrmInd;
    }

    public void setAcmbrhUncnfrmInd(String acmbrhUncnfrmInd) {
        this.acmbrhUncnfrmInd = acmbrhUncnfrmInd;
    }

    public String getAcmbrhUncnfrrsCd() {
        return acmbrhUncnfrrsCd;
    }

    public void setAcmbrhUncnfrrsCd(String acmbrhUncnfrrsCd) {
        this.acmbrhUncnfrrsCd = acmbrhUncnfrrsCd;
    }

    public String getEnrlhSpscvgsrcCd() {
        return enrlhSpscvgsrcCd;
    }

    public void setEnrlhSpscvgsrcCd(String enrlhSpscvgsrcCd) {
        this.enrlhSpscvgsrcCd = enrlhSpscvgsrcCd;
    }

    public String getEnrlhXcdgspsrcCd() {
        return enrlhXcdgspsrcCd;
    }

    public void setEnrlhXcdgspsrcCd(String enrlhXcdgspsrcCd) {
        this.enrlhXcdgspsrcCd = enrlhXcdgspsrcCd;
    }

    public Integer getAcmbrhSeccvgstCd() {
        return acmbrhSeccvgstCd;
    }

    public void setAcmbrhSeccvgstCd(Integer acmbrhSeccvgstCd) {
        this.acmbrhSeccvgstCd = acmbrhSeccvgstCd;
    }

    public String getAcmbrhCoceventDt() {
        return acmbrhCoceventDt;
    }

    public void setAcmbrhCoceventDt(String acmbrhCoceventDt) {
        this.acmbrhCoceventDt = acmbrhCoceventDt;
    }

    public String getAcmbrhCocexpDt() {
        return acmbrhCocexpDt;
    }

    public void setAcmbrhCocexpDt(String acmbrhCocexpDt) {
        this.acmbrhCocexpDt = acmbrhCocexpDt;
    }

    public Integer getAcmbrhCocpdmoCnt() {
        return acmbrhCocpdmoCnt;
    }

    public void setAcmbrhCocpdmoCnt(Integer acmbrhCocpdmoCnt) {
        this.acmbrhCocpdmoCnt = acmbrhCocpdmoCnt;
    }

    public String getStsrsnCd() {
        return stsrsnCd;
    }

    public void setStsrsnCd(String stsrsnCd) {
        this.stsrsnCd = stsrsnCd;
    }

}