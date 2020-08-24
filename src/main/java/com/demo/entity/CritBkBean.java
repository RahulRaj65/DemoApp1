package com.demo.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "crit_bk")
public class CritBkBean {

  @Id 
  private String NVIC;
  private String VEHCAT;
  private String EFFECTIVEDATE;
  private String CHANGETIMESTAMP;
  private String EFFECTIVEENDDATE;
  private String ENDDATETIMESTAMP;
  private String COMPANY;
  private String ACCEPTCRIT;
  private String INTERNETJEP;
	  
	public String getNVIC() {
		return NVIC;
	}
	public void setNVIC(String nVIC) {
		NVIC = nVIC;
	}
	public String getVEHCAT() {
		return VEHCAT;
	}
	public void setVEHCAT(String vEHCAT) {
		VEHCAT = vEHCAT;
	}
	public String getEFFECTIVEDATE() {
		return EFFECTIVEDATE;
	}
	public void setEFFECTIVEDATE(String eFFECTIVEDATE) {
		EFFECTIVEDATE = eFFECTIVEDATE;
	}
	public String getCHANGETIMESTAMP() {
		return CHANGETIMESTAMP;
	}
	public void setCHANGETIMESTAMP(String cHANGETIMESTAMP) {
		CHANGETIMESTAMP = cHANGETIMESTAMP;
	}
	public String getEFFECTIVEENDDATE() {
		return EFFECTIVEENDDATE;
	}
	public void setEFFECTIVEENDDATE(String eFFECTIVEENDDATE) {
		EFFECTIVEENDDATE = eFFECTIVEENDDATE;
	}
	public String getENDDATETIMESTAMP() {
		return ENDDATETIMESTAMP;
	}
	public void setENDDATETIMESTAMP(String eNDDATETIMESTAMP) {
		ENDDATETIMESTAMP = eNDDATETIMESTAMP;
	}
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}
	public String getACCEPTCRIT() {
		return ACCEPTCRIT;
	}
	public void setACCEPTCRIT(String aCCEPTCRIT) {
		ACCEPTCRIT = aCCEPTCRIT;
	}
	public String getINTERNETJEP() {
		return INTERNETJEP;
	}
	public void setINTERNETJEP(String iNTERNETJEP) {
		INTERNETJEP = iNTERNETJEP;
	}
	  
	  

}
