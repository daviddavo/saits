package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1



/**
 * Semestre generated by hbm2java
 */
public class Semestre  implements java.io.Serializable {


     private Integer semCod;
     private String semNombre;

    public Semestre() {
    }

    public Semestre(String semNombre) {
       this.semNombre = semNombre;
    }
   
    public Integer getSemCod() {
        return this.semCod;
    }
    
    public void setSemCod(Integer semCod) {
        this.semCod = semCod;
    }
    public String getSemNombre() {
        return this.semNombre;
    }
    
    public void setSemNombre(String semNombre) {
        this.semNombre = semNombre;
    }




}


