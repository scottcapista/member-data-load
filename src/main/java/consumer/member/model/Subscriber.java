package consumer.member.model;

import java.time.LocalDate;

public class Subscriber  {
    private int CUMB_ID_NO;
    private LocalDate CUMBH_EFF_DT;
    private LocalDate CUMBH_EXPRTN_DT;
    private String CUMBH_LAST_NM;
    private String CUMBH_FST_NM;

    public int getCUMB_ID_NO() {
        return CUMB_ID_NO;
    }

    public void setCUMB_ID_NO(int CUMB_ID_NO) {
        this.CUMB_ID_NO = CUMB_ID_NO;
    }

    public LocalDate getCUMBH_EFF_DT() {
        return CUMBH_EFF_DT;
    }

    public void setCUMBH_EFF_DT(LocalDate CUMBH_EFF_DT) {
        this.CUMBH_EFF_DT = CUMBH_EFF_DT;
    }

    public LocalDate getCUMBH_EXPRTN_DT() {
        return CUMBH_EXPRTN_DT;
    }

    public void setCUMBH_EXPRTN_DT(LocalDate CUMBH_EXPRTN_DT) {
        this.CUMBH_EXPRTN_DT = CUMBH_EXPRTN_DT;
    }

    public String getCUMBH_LAST_NM() {
        return CUMBH_LAST_NM;
    }

    public void setCUMBH_LAST_NM(String CUMBH_LAST_NM) {
        this.CUMBH_LAST_NM = CUMBH_LAST_NM;
    }

    public String getCUMBH_FST_NM() {
        return CUMBH_FST_NM;
    }

    public void setCUMBH_FST_NM(String CUMBH_FST_NM) {
        this.CUMBH_FST_NM = CUMBH_FST_NM;
    }
}
