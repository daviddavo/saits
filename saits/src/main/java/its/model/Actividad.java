package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1



/**
 * Actividad generated by hbm2java
 */
public class Actividad  implements java.io.Serializable {


     private Integer actCod;
     private String actDesc;

    public Actividad() {
    }

    public Actividad(String actDesc) {
       this.actDesc = actDesc;
    }
   
    public Integer getActCod() {
        return this.actCod;
    }
    
    public void setActCod(Integer actCod) {
        this.actCod = actCod;
    }
    public String getActDesc() {
        return this.actDesc;
    }
    
    public void setActDesc(String actDesc) {
        this.actDesc = actDesc;
    }




}

