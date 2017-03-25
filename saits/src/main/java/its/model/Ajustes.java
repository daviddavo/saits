package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Ajustes generated by hbm2java
 */
public class Ajustes  implements java.io.Serializable {


     private AjustesId id;
     private Date ajuCarg;
     private Date ajuFec;
     private int motCod;
     private String ajuObs;

    public Ajustes() {
    }

	
    public Ajustes(AjustesId id, int motCod) {
        this.id = id;
        this.motCod = motCod;
    }
    public Ajustes(AjustesId id, Date ajuCarg, Date ajuFec, int motCod, String ajuObs) {
       this.id = id;
       this.ajuCarg = ajuCarg;
       this.ajuFec = ajuFec;
       this.motCod = motCod;
       this.ajuObs = ajuObs;
    }
   
    public AjustesId getId() {
        return this.id;
    }
    
    public void setId(AjustesId id) {
        this.id = id;
    }
    public Date getAjuCarg() {
        return this.ajuCarg;
    }
    
    public void setAjuCarg(Date ajuCarg) {
        this.ajuCarg = ajuCarg;
    }
    public Date getAjuFec() {
        return this.ajuFec;
    }
    
    public void setAjuFec(Date ajuFec) {
        this.ajuFec = ajuFec;
    }
    public int getMotCod() {
        return this.motCod;
    }
    
    public void setMotCod(int motCod) {
        this.motCod = motCod;
    }
    public String getAjuObs() {
        return this.ajuObs;
    }
    
    public void setAjuObs(String ajuObs) {
        this.ajuObs = ajuObs;
    }




}

