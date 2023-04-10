package crud.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import crud.onpe.model.Departamento;
import crud.onpe.model.Distrito;
import crud.onpe.model.GrupoVotacion;
import crud.onpe.model.GrupoVotacionNumero;
import crud.onpe.model.Provincia;

@Repository
public interface IGrupoVotacionNumero extends JpaRepository<GrupoVotacionNumero, Integer>{
	
	@Query(value = "{select * from GrupoVotacion}", nativeQuery = true )
    GrupoVotacion getGrupoVotacion();
	
	 @Query(value = "{call usp_getGrupoVotacion(:idGrupoVotacion)}", nativeQuery = true )
	    GrupoVotacionNumero getGrupoVotacionNumero(String idGrupoVotacion);
	 
	 @Query(value = "{select * from Departamento}", nativeQuery = true )
	    List<Departamento> getDepartamento(int id);
	 
	 @Query(value = "{select * from Provincia}", nativeQuery = true )
	    List<Provincia> getProvincia(int id);
	 
	 @Query(value = "{select * from Distrito}", nativeQuery = true )
	    List<Distrito> getDistrito(int id);
	
}
