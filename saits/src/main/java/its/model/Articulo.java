package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1



/**
 * Articulo generated by hbm2java
 */
public class Articulo  implements java.io.Serializable {


     private Integer artCod;
     private String artDesc;
     private int tpartCod;
     private String artCodbar;
     private int autCod;
     private int ediCod;
     private int clasCod;
     private int temCod;
     private String artCdd;

    public Articulo() {
    }

	
    public Articulo(int tpartCod, int autCod, int ediCod, int clasCod, int temCod) {
        this.tpartCod = tpartCod;
        this.autCod = autCod;
        this.ediCod = ediCod;
        this.clasCod = clasCod;
        this.temCod = temCod;
    }
    public Articulo(String artDesc, int tpartCod, String artCodbar, int autCod, int ediCod, int clasCod, int temCod, String artCdd) {
       this.artDesc = artDesc;
       this.tpartCod = tpartCod;
       this.artCodbar = artCodbar;
       this.autCod = autCod;
       this.ediCod = ediCod;
       this.clasCod = clasCod;
       this.temCod = temCod;
       this.artCdd = artCdd;
    }
   
    public Integer getArtCod() {
        return this.artCod;
    }
    
    public void setArtCod(Integer artCod) {
        this.artCod = artCod;
    }
    public String getArtDesc() {
        return this.artDesc;
    }
    
    public void setArtDesc(String artDesc) {
        this.artDesc = artDesc;
    }
    public int getTpartCod() {
        return this.tpartCod;
    }
    
    public void setTpartCod(int tpartCod) {
        this.tpartCod = tpartCod;
    }
    public String getArtCodbar() {
        return this.artCodbar;
    }
    
    public void setArtCodbar(String artCodbar) {
        this.artCodbar = artCodbar;
    }
    public int getAutCod() {
        return this.autCod;
    }
    
    public void setAutCod(int autCod) {
        this.autCod = autCod;
    }
    public int getEdiCod() {
        return this.ediCod;
    }
    
    public void setEdiCod(int ediCod) {
        this.ediCod = ediCod;
    }
    public int getClasCod() {
        return this.clasCod;
    }
    
    public void setClasCod(int clasCod) {
        this.clasCod = clasCod;
    }
    public int getTemCod() {
        return this.temCod;
    }
    
    public void setTemCod(int temCod) {
        this.temCod = temCod;
    }
    public String getArtCdd() {
        return this.artCdd;
    }
    
    public void setArtCdd(String artCdd) {
        this.artCdd = artCdd;
    }




}


