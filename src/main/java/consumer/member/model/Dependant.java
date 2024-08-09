package consumer.member.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dependant {

    @SerializedName("cumbh_eff_dt")
    @Expose
    private LocalDate cumbhEffDt;
    @SerializedName("cumbh_exprtn_dt")
    @Expose
    private LocalDate cumbhExprtnDt;
    @SerializedName("cumbh_last_nm")
    @Expose
    private String cumbhLastNm;
    @SerializedName("cumbh_fst_nm")
    @Expose
    private String cumbhFstNm;
    @SerializedName("cumbh_shrt_mid_nm")
    @Expose
    private String cumbhShrtMidNm;
    @SerializedName("cumbh_sfx_nm")
    @Expose
    private String cumbhSfxNm;
    @SerializedName("cumbh_subscrbr_no")
    @Expose
    private String cumbhSubscrbrNo;
    @SerializedName("cumbh_birth_dt")
    @Expose
    private LocalDate cumbhBirthDt;
    @SerializedName("cumbh_sex_cd")
    @Expose
    private String cumbhSexCd;
    @SerializedName("cumbh_medicare_no")
    @Expose
    private String cumbhMedicareNo;
    @SerializedName("cumbh_srcpstd_dt")
    @Expose
    private String cumbhSrcpstdDt;
    @SerializedName("cumbh_cobinscr_cd")
    @Expose
    private String cumbhCobinscrCd;
    @SerializedName("subsh_mrtlst_cd")
    @Expose
    private String subshMrtlstCd;
    @SerializedName("cumb_id_no")
    @Expose
    private Integer cumbIdNo;
    @SerializedName("cumbh_data_sorc_cd")
    @Expose
    private String cumbhDataSorcCd;
    @SerializedName("cumbh_hmombrid_cd")
    @Expose
    private String cumbhHmombridCd;
    @SerializedName("cumbh_medcrcvrg_cd")
    @Expose
    private String cumbhMedcrcvrgCd;
    @SerializedName("subsh_sxcddtsrc_cd")
    @Expose
    private String subshSxcddtsrcCd;
    @SerializedName("cumbh_uncnfrmd_ind")
    @Expose
    private String cumbhUncnfrmdInd;
    @SerializedName("cumbh_uncnfrmrs_cd")
    @Expose
    private String cumbhUncnfrmrsCd;
    @SerializedName("cumbh_frstnmdsr_cd")
    @Expose
    private String cumbhFrstnmdsrCd;
    @SerializedName("cumbh_brthdtsr_cd")
    @Expose
    private String cumbhBrthdtsrCd;
    @SerializedName("subsh_hmosrcssn_no")
    @Expose
    private Integer subshHmosrcssnNo;
    @SerializedName("cumbh_shmdnmtsr_cd")
    @Expose
    private String cumbhShmdnmtsrCd;
    @SerializedName("cumbh_cobcrrsrc_cd")
    @Expose
    private String cumbhCobcrrsrcCd;
    @SerializedName("cust_no")
    @Expose
    private Integer custNo;
    @SerializedName("cumb_st_cd")
    @Expose
    private String cumbStCd;
    @SerializedName("cumb_zip_cd")
    @Expose
    private String cumbZipCd;
    @SerializedName("cumbh_ethnic_cd")
    @Expose
    private String cumbhEthnicCd;
    @SerializedName("cumbh_lang_pref_cd")
    @Expose
    private String cumbhLangPrefCd;
    @SerializedName("cumbh_wrtn_lang_cd")
    @Expose
    private String cumbhWrtnLangCd;
    @SerializedName("cumbh_plsp_alt_id")
    @Expose
    private String cumbhPlspAltId;
    @SerializedName("cumbh_subsnoql_cd")
    @Expose
    private String cumbhSubsnoqlCd;
    @SerializedName("cumbh_psaltidql_cd")
    @Expose
    private String cumbhPsaltidqlCd;
    @SerializedName("tbcous_cd")
    @Expose
    private String tbcousCd;
    @SerializedName("mlttl_id")
    @Expose
    private Integer mlttlId;
    @SerializedName("cumbh_as_frst_nm")
    @Expose
    private String cumbhAsFrstNm;
    @SerializedName("cumbh_as_lst_nm")
    @Expose
    private String cumbhAsLstNm;
    @SerializedName("cumbh_as_mddl_nm")
    @Expose
    private String cumbhAsMddlNm;
    @SerializedName("cumbh_asn_prf_txt")
    @Expose
    private String cumbhAsnPrfTxt;
    @SerializedName("cumbh_asn_sfx_txt")
    @Expose
    private String cumbhAsnSfxTxt;
    private ArrayList<Coverage> coverageArray;

    public Dependant() {
    }


    public LocalDate getCumbhEffDt() {
        return cumbhEffDt;
    }

    public void setCumbhEffDt(LocalDate cumbhEffDt) {
        this.cumbhEffDt = cumbhEffDt;
    }

    public LocalDate getCumbhExprtnDt() {
        return cumbhExprtnDt;
    }

    public void setCumbhExprtnDt(LocalDate cumbhExprtnDt) {
        this.cumbhExprtnDt = cumbhExprtnDt;
    }

    public String getCumbhLastNm() {
        return cumbhLastNm;
    }

    public void setCumbhLastNm(String cumbhLastNm) {
        this.cumbhLastNm = cumbhLastNm;
    }

    public String getCumbhFstNm() {
        return cumbhFstNm;
    }

    public void setCumbhFstNm(String cumbhFstNm) {
        this.cumbhFstNm = cumbhFstNm;
    }

    public String getCumbhShrtMidNm() {
        return cumbhShrtMidNm;
    }

    public void setCumbhShrtMidNm(String cumbhShrtMidNm) {
        this.cumbhShrtMidNm = cumbhShrtMidNm;
    }

    public String getCumbhSfxNm() {
        return cumbhSfxNm;
    }

    public void setCumbhSfxNm(String cumbhSfxNm) {
        this.cumbhSfxNm = cumbhSfxNm;
    }

    public String getCumbhSubscrbrNo() {
        return cumbhSubscrbrNo;
    }

    public void setCumbhSubscrbrNo(String cumbhSubscrbrNo) {
        this.cumbhSubscrbrNo = cumbhSubscrbrNo;
    }

    public LocalDate getCumbhBirthDt() {
        return cumbhBirthDt;
    }

    public void setCumbhBirthDt(LocalDate cumbhBirthDt) {
        this.cumbhBirthDt = cumbhBirthDt;
    }

    public String getCumbhSexCd() {
        return cumbhSexCd;
    }

    public void setCumbhSexCd(String cumbhSexCd) {
        this.cumbhSexCd = cumbhSexCd;
    }

    public String getCumbhMedicareNo() {
        return cumbhMedicareNo;
    }

    public void setCumbhMedicareNo(String cumbhMedicareNo) {
        this.cumbhMedicareNo = cumbhMedicareNo;
    }

    public String getCumbhSrcpstdDt() {
        return cumbhSrcpstdDt;
    }

    public void setCumbhSrcpstdDt(String cumbhSrcpstdDt) {
        this.cumbhSrcpstdDt = cumbhSrcpstdDt;
    }

    public String getCumbhCobinscrCd() {
        return cumbhCobinscrCd;
    }

    public void setCumbhCobinscrCd(String cumbhCobinscrCd) {
        this.cumbhCobinscrCd = cumbhCobinscrCd;
    }

    public String getSubshMrtlstCd() {
        return subshMrtlstCd;
    }

    public void setSubshMrtlstCd(String subshMrtlstCd) {
        this.subshMrtlstCd = subshMrtlstCd;
    }

    public Integer getCumbIdNo() {
        return cumbIdNo;
    }

    public void setCumbIdNo(Integer cumbIdNo) {
        this.cumbIdNo = cumbIdNo;
    }

    public String getCumbhDataSorcCd() {
        return cumbhDataSorcCd;
    }

    public void setCumbhDataSorcCd(String cumbhDataSorcCd) {
        this.cumbhDataSorcCd = cumbhDataSorcCd;
    }

    public String getCumbhHmombridCd() {
        return cumbhHmombridCd;
    }

    public void setCumbhHmombridCd(String cumbhHmombridCd) {
        this.cumbhHmombridCd = cumbhHmombridCd;
    }

    public String getCumbhMedcrcvrgCd() {
        return cumbhMedcrcvrgCd;
    }

    public void setCumbhMedcrcvrgCd(String cumbhMedcrcvrgCd) {
        this.cumbhMedcrcvrgCd = cumbhMedcrcvrgCd;
    }

    public String getSubshSxcddtsrcCd() {
        return subshSxcddtsrcCd;
    }

    public void setSubshSxcddtsrcCd(String subshSxcddtsrcCd) {
        this.subshSxcddtsrcCd = subshSxcddtsrcCd;
    }

    public String getCumbhUncnfrmdInd() {
        return cumbhUncnfrmdInd;
    }

    public void setCumbhUncnfrmdInd(String cumbhUncnfrmdInd) {
        this.cumbhUncnfrmdInd = cumbhUncnfrmdInd;
    }

    public String getCumbhUncnfrmrsCd() {
        return cumbhUncnfrmrsCd;
    }

    public void setCumbhUncnfrmrsCd(String cumbhUncnfrmrsCd) {
        this.cumbhUncnfrmrsCd = cumbhUncnfrmrsCd;
    }

    public String getCumbhFrstnmdsrCd() {
        return cumbhFrstnmdsrCd;
    }

    public void setCumbhFrstnmdsrCd(String cumbhFrstnmdsrCd) {
        this.cumbhFrstnmdsrCd = cumbhFrstnmdsrCd;
    }

    public String getCumbhBrthdtsrCd() {
        return cumbhBrthdtsrCd;
    }

    public void setCumbhBrthdtsrCd(String cumbhBrthdtsrCd) {
        this.cumbhBrthdtsrCd = cumbhBrthdtsrCd;
    }

    public Integer getSubshHmosrcssnNo() {
        return subshHmosrcssnNo;
    }

    public void setSubshHmosrcssnNo(Integer subshHmosrcssnNo) {
        this.subshHmosrcssnNo = subshHmosrcssnNo;
    }

    public String getCumbhShmdnmtsrCd() {
        return cumbhShmdnmtsrCd;
    }

    public void setCumbhShmdnmtsrCd(String cumbhShmdnmtsrCd) {
        this.cumbhShmdnmtsrCd = cumbhShmdnmtsrCd;
    }

    public String getCumbhCobcrrsrcCd() {
        return cumbhCobcrrsrcCd;
    }

    public void setCumbhCobcrrsrcCd(String cumbhCobcrrsrcCd) {
        this.cumbhCobcrrsrcCd = cumbhCobcrrsrcCd;
    }

    public Integer getCustNo() {
        return custNo;
    }

    public void setCustNo(Integer custNo) {
        this.custNo = custNo;
    }

    public String getCumbStCd() {
        return cumbStCd;
    }

    public void setCumbStCd(String cumbStCd) {
        this.cumbStCd = cumbStCd;
    }

    public String getCumbZipCd() {
        return cumbZipCd;
    }

    public void setCumbZipCd(String cumbZipCd) {
        this.cumbZipCd = cumbZipCd;
    }

    public String getCumbhEthnicCd() {
        return cumbhEthnicCd;
    }

    public void setCumbhEthnicCd(String cumbhEthnicCd) {
        this.cumbhEthnicCd = cumbhEthnicCd;
    }

    public String getCumbhLangPrefCd() {
        return cumbhLangPrefCd;
    }

    public void setCumbhLangPrefCd(String cumbhLangPrefCd) {
        this.cumbhLangPrefCd = cumbhLangPrefCd;
    }

    public String getCumbhWrtnLangCd() {
        return cumbhWrtnLangCd;
    }

    public void setCumbhWrtnLangCd(String cumbhWrtnLangCd) {
        this.cumbhWrtnLangCd = cumbhWrtnLangCd;
    }

    public String getCumbhPlspAltId() {
        return cumbhPlspAltId;
    }

    public void setCumbhPlspAltId(String cumbhPlspAltId) {
        this.cumbhPlspAltId = cumbhPlspAltId;
    }

    public String getCumbhSubsnoqlCd() {
        return cumbhSubsnoqlCd;
    }

    public void setCumbhSubsnoqlCd(String cumbhSubsnoqlCd) {
        this.cumbhSubsnoqlCd = cumbhSubsnoqlCd;
    }

    public String getCumbhPsaltidqlCd() {
        return cumbhPsaltidqlCd;
    }

    public void setCumbhPsaltidqlCd(String cumbhPsaltidqlCd) {
        this.cumbhPsaltidqlCd = cumbhPsaltidqlCd;
    }

    public String getTbcousCd() {
        return tbcousCd;
    }

    public void setTbcousCd(String tbcousCd) {
        this.tbcousCd = tbcousCd;
    }

    public Integer getMlttlId() {
        return mlttlId;
    }

    public void setMlttlId(Integer mlttlId) {
        this.mlttlId = mlttlId;
    }

    public String getCumbhAsFrstNm() {
        return cumbhAsFrstNm;
    }

    public void setCumbhAsFrstNm(String cumbhAsFrstNm) {
        this.cumbhAsFrstNm = cumbhAsFrstNm;
    }

    public String getCumbhAsLstNm() {
        return cumbhAsLstNm;
    }

    public void setCumbhAsLstNm(String cumbhAsLstNm) {
        this.cumbhAsLstNm = cumbhAsLstNm;
    }

    public String getCumbhAsMddlNm() {
        return cumbhAsMddlNm;
    }

    public void setCumbhAsMddlNm(String cumbhAsMddlNm) {
        this.cumbhAsMddlNm = cumbhAsMddlNm;
    }

    public String getCumbhAsnPrfTxt() {
        return cumbhAsnPrfTxt;
    }

    public void setCumbhAsnPrfTxt(String cumbhAsnPrfTxt) {
        this.cumbhAsnPrfTxt = cumbhAsnPrfTxt;
    }

    public String getCumbhAsnSfxTxt() {
        return cumbhAsnSfxTxt;
    }

    public void setCumbhAsnSfxTxt(String cumbhAsnSfxTxt) {
        this.cumbhAsnSfxTxt = cumbhAsnSfxTxt;
    }

    public ArrayList<Coverage> getCoverageArray() {
        return coverageArray;
    }

    public void setCoverageArray(ArrayList<Coverage> coverageArray) {
        this.coverageArray = coverageArray;
    }
}