package crud.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Departamento {
	
      @Id
	  private String Detalle;
	  
	  
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	  
	  

}
