package crud.onpe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import crud.onpe.model.resumenelecciones;

@Repository
public interface IResumenGeneral extends JpaRepository<resumenelecciones, Integer>{

	
	@Query(value = "EXEC sp_getResumen_CahuanaHuamani", nativeQuery = true )
	resumenelecciones getcahuana();
	
}
