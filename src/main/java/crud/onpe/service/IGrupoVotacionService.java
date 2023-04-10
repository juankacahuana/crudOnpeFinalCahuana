package crud.onpe.service;

import java.util.List;

import crud.onpe.model.Departamento;
import crud.onpe.model.Distrito;
import crud.onpe.model.GrupoVotacion;
import crud.onpe.model.GrupoVotacionNumero;
import crud.onpe.model.Provincia;

public interface IGrupoVotacionService {
	
	public GrupoVotacion getGrupoVotacion();
	public GrupoVotacionNumero getGrupoVotacionNumero(String idGrupoVotacion);
	public List<Departamento> getDepartamento(int id);
	public List<Provincia> getProvincia(int id);
	public List<Distrito> getDistrito(int id);
	
	
	

}
