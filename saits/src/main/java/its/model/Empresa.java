package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private Integer empCod;
     private String empNom;
     private String callePrincipal;
     private String nro;
     private String calleSecundaria;
     private String empTelefono;
     private String empCelular;
     private String empEmail;
     private String empSlogan;
     private Date fechaHoraCarga;
     private byte[] empLogo;

    public Empresa() {
    }

    public Empresa(String empNom, String callePrincipal, String nro, String calleSecundaria, String empTelefono, String empCelular, String empEmail, String empSlogan, Date fechaHoraCarga, byte[] empLogo) {
       this.empNom = empNom;
       this.callePrincipal = callePrincipal;
       this.nro = nro;
       this.calleSecundaria = calleSecundaria;
       this.empTelefono = empTelefono;
       this.empCelular = empCelular;
       this.empEmail = empEmail;
       this.empSlogan = empSlogan;
       this.fechaHoraCarga = fechaHoraCarga;
       this.empLogo = empLogo;
    }
   
    public Integer getEmpCod() {
        return this.empCod;
    }
    
    public void setEmpCod(Integer empCod) {
        this.empCod = empCod;
    }
    public String getEmpNom() {
        return this.empNom;
    }
    
    public void setEmpNom(String empNom) {
        this.empNom = empNom;
    }
    public String getCallePrincipal() {
        return this.callePrincipal;
    }
    
    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }
    public String getNro() {
        return this.nro;
    }
    
    public void setNro(String nro) {
        this.nro = nro;
    }
    public String getCalleSecundaria() {
        return this.calleSecundaria;
    }
    
    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }
    public String getEmpTelefono() {
        return this.empTelefono;
    }
    
    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }
    public String getEmpCelular() {
        return this.empCelular;
    }
    
    public void setEmpCelular(String empCelular) {
        this.empCelular = empCelular;
    }
    public String getEmpEmail() {
        return this.empEmail;
    }
    
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    public String getEmpSlogan() {
        return this.empSlogan;
    }
    
    public void setEmpSlogan(String empSlogan) {
        this.empSlogan = empSlogan;
    }
    public Date getFechaHoraCarga() {
        return this.fechaHoraCarga;
    }
    
    public void setFechaHoraCarga(Date fechaHoraCarga) {
        this.fechaHoraCarga = fechaHoraCarga;
    }
    public byte[] getEmpLogo() {
        return this.empLogo;
    }
    
    public void setEmpLogo(byte[] empLogo) {
        this.empLogo = empLogo;
    }




}


