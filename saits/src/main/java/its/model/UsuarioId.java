package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1



/**
 * UsuarioId generated by hbm2java
 */
public class UsuarioId  implements java.io.Serializable {


     private int usuCod;
     private int sucCod;

    public UsuarioId() {
    }

    public UsuarioId(int usuCod, int sucCod) {
       this.usuCod = usuCod;
       this.sucCod = sucCod;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsuarioId) ) return false;
		 UsuarioId castOther = ( UsuarioId ) other; 
         
		 return (this.getUsuCod()==castOther.getUsuCod())
 && (this.getSucCod()==castOther.getSucCod());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUsuCod();
         result = 37 * result + this.getSucCod();
         return result;
   }   


}

