package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1



/**
 * Deposito generated by hbm2java
 */
public class Deposito  implements java.io.Serializable {


     private Integer depCod;
     private String depDesc;

    public Deposito() {
    }

    public Deposito(String depDesc) {
       this.depDesc = depDesc;
    }
   
    public Integer getDepCod() {
        return this.depCod;
    }
    
    public void setDepCod(Integer depCod) {
        this.depCod = depCod;
    }
    public String getDepDesc() {
        return this.depDesc;
    }
    
    public void setDepDesc(String depDesc) {
        this.depDesc = depDesc;
    }




}


