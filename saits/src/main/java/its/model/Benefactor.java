package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1



/**
 * Benefactor generated by hbm2java
 */
public class Benefactor  implements java.io.Serializable {


     private Integer benCod;
     private String benRazonSocial;
     private String benTipoDoc;
     private String benNroDoc;
     private String benDireccion;
     private String benTelefono;
     private String benCelular;
     private String benEmail;
     private String benContacto;

    public Benefactor() {
    }

    public Benefactor(String benRazonSocial, String benTipoDoc, String benNroDoc, String benDireccion, String benTelefono, String benCelular, String benEmail, String benContacto) {
       this.benRazonSocial = benRazonSocial;
       this.benTipoDoc = benTipoDoc;
       this.benNroDoc = benNroDoc;
       this.benDireccion = benDireccion;
       this.benTelefono = benTelefono;
       this.benCelular = benCelular;
       this.benEmail = benEmail;
       this.benContacto = benContacto;
    }
   
    public Integer getBenCod() {
        return this.benCod;
    }
    
    public void setBenCod(Integer benCod) {
        this.benCod = benCod;
    }
    public String getBenRazonSocial() {
        return this.benRazonSocial;
    }
    
    public void setBenRazonSocial(String benRazonSocial) {
        this.benRazonSocial = benRazonSocial;
    }
    public String getBenTipoDoc() {
        return this.benTipoDoc;
    }
    
    public void setBenTipoDoc(String benTipoDoc) {
        this.benTipoDoc = benTipoDoc;
    }
    public String getBenNroDoc() {
        return this.benNroDoc;
    }
    
    public void setBenNroDoc(String benNroDoc) {
        this.benNroDoc = benNroDoc;
    }
    public String getBenDireccion() {
        return this.benDireccion;
    }
    
    public void setBenDireccion(String benDireccion) {
        this.benDireccion = benDireccion;
    }
    public String getBenTelefono() {
        return this.benTelefono;
    }
    
    public void setBenTelefono(String benTelefono) {
        this.benTelefono = benTelefono;
    }
    public String getBenCelular() {
        return this.benCelular;
    }
    
    public void setBenCelular(String benCelular) {
        this.benCelular = benCelular;
    }
    public String getBenEmail() {
        return this.benEmail;
    }
    
    public void setBenEmail(String benEmail) {
        this.benEmail = benEmail;
    }
    public String getBenContacto() {
        return this.benContacto;
    }
    
    public void setBenContacto(String benContacto) {
        this.benContacto = benContacto;
    }




}


