package its.model;
// Generated 06/03/2017 11:36:42 PM by Hibernate Tools 4.3.1



/**
 * PlanMateriaId generated by hbm2java
 */
public class PlanMateriaId  implements java.io.Serializable {


     private int plaMat;
     private int matCod;

    public PlanMateriaId() {
    }

    public PlanMateriaId(int plaMat, int matCod) {
       this.plaMat = plaMat;
       this.matCod = matCod;
    }
   
    public int getPlaMat() {
        return this.plaMat;
    }
    
    public void setPlaMat(int plaMat) {
        this.plaMat = plaMat;
    }
    public int getMatCod() {
        return this.matCod;
    }
    
    public void setMatCod(int matCod) {
        this.matCod = matCod;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PlanMateriaId) ) return false;
		 PlanMateriaId castOther = ( PlanMateriaId ) other; 
         
		 return (this.getPlaMat()==castOther.getPlaMat())
 && (this.getMatCod()==castOther.getMatCod());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPlaMat();
         result = 37 * result + this.getMatCod();
         return result;
   }   


}


