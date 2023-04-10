package crud.onpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.onpe.model.Departamento;
import crud.onpe.model.Distrito;
import crud.onpe.model.GrupoVotacion;
import crud.onpe.model.GrupoVotacionNumero;
import crud.onpe.model.Provincia;
import crud.onpe.repository.IGrupoVotacionNumero;

@Service
public class GrupoVotacionService implements IGrupoVotacionService{
	
	@Autowired
	private IGrupoVotacionNumero iGrupoVotacionNumero;

	@Override
	public GrupoVotacionNumero getGrupoVotacionNumero(String idGrupoVotacion) {
		// TODO Auto-generated method stub
		return iGrupoVotacionNumero.getGrupoVotacionNumero(idGrupoVotacion);
	}

	@Override
	public List<Departamento> getDepartamento(int id) {
		// TODO Auto-generated method stub
		return iGrupoVotacionNumero.getDepartamento(id);
	}

	@Override
	public List<Provincia> getProvincia(int id) {
		// TODO Auto-generated method stub
		return iGrupoVotacionNumero.getProvincia(id);
	}

	@Override
	public List<Distrito> getDistrito(int id) {
		// TODO Auto-generated method stub
		return iGrupoVotacionNumero.getDistrito(id);
	}

	@Override
	public GrupoVotacion getGrupoVotacion() {
		// TODO Auto-generated method stub
		return iGrupoVotacionNumero.getGrupoVotacion();
	}


}
