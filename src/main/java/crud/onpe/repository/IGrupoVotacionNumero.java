package crud.onpe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import crud.onpe.model.GrupoVotacionNumero;

@Repository
public interface IGrupoVotacionNumero extends JpaRepository<GrupoVotacionNumero, Integer>{
	
	 @Query(value = "{call usp_getGrupoVotacion(:idGrupoVotacion)}", nativeQuery = true )
	    GrupoVotacionNumero getGrupoVotacionNumero(String idGrupoVotacion);
	
}
