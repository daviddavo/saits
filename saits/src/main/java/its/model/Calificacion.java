package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Calificacion generated by hbm2java
 */
public class Calificacion  implements java.io.Serializable {


     private CalificacionId id;
     private Date calCarg;

    public Calificacion() {
    }

	
    public Calificacion(CalificacionId id) {
        this.id = id;
    }
    public Calificacion(CalificacionId id, Date calCarg) {
       this.id = id;
       this.calCarg = calCarg;
    }
   
    public CalificacionId getId() {
        return this.id;
    }
    
    public void setId(CalificacionId id) {
        this.id = id;
    }
    public Date getCalCarg() {
        return this.calCarg;
    }
    
    public void setCalCarg(Date calCarg) {
        this.calCarg = calCarg;
    }




}


