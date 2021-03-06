package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1



/**
 * CobroId generated by hbm2java
 */
public class CobroId  implements java.io.Serializable {


     private int cobCod;
     private int apciCod;

    public CobroId() {
    }

    public CobroId(int cobCod, int apciCod) {
       this.cobCod = cobCod;
       this.apciCod = apciCod;
    }
   
    public int getCobCod() {
        return this.cobCod;
    }
    
    public void setCobCod(int cobCod) {
        this.cobCod = cobCod;
    }
    public int getApciCod() {
        return this.apciCod;
    }
    
    public void setApciCod(int apciCod) {
        this.apciCod = apciCod;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CobroId) ) return false;
		 CobroId castOther = ( CobroId ) other; 
         
		 return (this.getCobCod()==castOther.getCobCod())
 && (this.getApciCod()==castOther.getApciCod());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCobCod();
         result = 37 * result + this.getApciCod();
         return result;
   }   


}


