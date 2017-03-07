package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PlanillaAsistencia generated by hbm2java
 */
public class PlanillaAsistencia  implements java.io.Serializable {


     private PlanillaAsistenciaId id;
     private Date plaFecEnt;
     private Date plaAsCarg;
     private int usuCod;
     private int sucCod;

    public PlanillaAsistencia() {
    }

	
    public PlanillaAsistencia(PlanillaAsistenciaId id, int usuCod, int sucCod) {
        this.id = id;
        this.usuCod = usuCod;
        this.sucCod = sucCod;
    }
    public PlanillaAsistencia(PlanillaAsistenciaId id, Date plaFecEnt, Date plaAsCarg, int usuCod, int sucCod) {
       this.id = id;
       this.plaFecEnt = plaFecEnt;
       this.plaAsCarg = plaAsCarg;
       this.usuCod = usuCod;
       this.sucCod = sucCod;
    }
   
    public PlanillaAsistenciaId getId() {
        return this.id;
    }
    
    public void setId(PlanillaAsistenciaId id) {
        this.id = id;
    }
    public Date getPlaFecEnt() {
        return this.plaFecEnt;
    }
    
    public void setPlaFecEnt(Date plaFecEnt) {
        this.plaFecEnt = plaFecEnt;
    }
    public Date getPlaAsCarg() {
        return this.plaAsCarg;
    }
    
    public void setPlaAsCarg(Date plaAsCarg) {
        this.plaAsCarg = plaAsCarg;
    }
    public int getUsuCod() {
        return this.usuCod;
    }
    
    public void setUsuCod(int usuCod) {
        this.usuCod = usuCod;
    }
    public int getSucCod() {
        return this.sucCod;
    }
    
    public void setSucCod(int sucCod) {
        this.sucCod = sucCod;
    }




}


