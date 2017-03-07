package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AperCie generated by hbm2java
 */
public class AperCie  implements java.io.Serializable {


     private AperCieId id;
     private Date apciFecape;
     private Date apcHsape;
     private Date apciFeccie;
     private Date apciHscie;
     private Double apciMonIni;
     private Double apciMonEfe;
     private Double apciMonTar;
     private Double apciMonChe;
     private Double apciMonCie;
     private Character apciEst;

    public AperCie() {
    }

	
    public AperCie(AperCieId id) {
        this.id = id;
    }
    public AperCie(AperCieId id, Date apciFecape, Date apcHsape, Date apciFeccie, Date apciHscie, Double apciMonIni, Double apciMonEfe, Double apciMonTar, Double apciMonChe, Double apciMonCie, Character apciEst) {
       this.id = id;
       this.apciFecape = apciFecape;
       this.apcHsape = apcHsape;
       this.apciFeccie = apciFeccie;
       this.apciHscie = apciHscie;
       this.apciMonIni = apciMonIni;
       this.apciMonEfe = apciMonEfe;
       this.apciMonTar = apciMonTar;
       this.apciMonChe = apciMonChe;
       this.apciMonCie = apciMonCie;
       this.apciEst = apciEst;
    }
   
    public AperCieId getId() {
        return this.id;
    }
    
    public void setId(AperCieId id) {
        this.id = id;
    }
    public Date getApciFecape() {
        return this.apciFecape;
    }
    
    public void setApciFecape(Date apciFecape) {
        this.apciFecape = apciFecape;
    }
    public Date getApcHsape() {
        return this.apcHsape;
    }
    
    public void setApcHsape(Date apcHsape) {
        this.apcHsape = apcHsape;
    }
    public Date getApciFeccie() {
        return this.apciFeccie;
    }
    
    public void setApciFeccie(Date apciFeccie) {
        this.apciFeccie = apciFeccie;
    }
    public Date getApciHscie() {
        return this.apciHscie;
    }
    
    public void setApciHscie(Date apciHscie) {
        this.apciHscie = apciHscie;
    }
    public Double getApciMonIni() {
        return this.apciMonIni;
    }
    
    public void setApciMonIni(Double apciMonIni) {
        this.apciMonIni = apciMonIni;
    }
    public Double getApciMonEfe() {
        return this.apciMonEfe;
    }
    
    public void setApciMonEfe(Double apciMonEfe) {
        this.apciMonEfe = apciMonEfe;
    }
    public Double getApciMonTar() {
        return this.apciMonTar;
    }
    
    public void setApciMonTar(Double apciMonTar) {
        this.apciMonTar = apciMonTar;
    }
    public Double getApciMonChe() {
        return this.apciMonChe;
    }
    
    public void setApciMonChe(Double apciMonChe) {
        this.apciMonChe = apciMonChe;
    }
    public Double getApciMonCie() {
        return this.apciMonCie;
    }
    
    public void setApciMonCie(Double apciMonCie) {
        this.apciMonCie = apciMonCie;
    }
    public Character getApciEst() {
        return this.apciEst;
    }
    
    public void setApciEst(Character apciEst) {
        this.apciEst = apciEst;
    }




}


