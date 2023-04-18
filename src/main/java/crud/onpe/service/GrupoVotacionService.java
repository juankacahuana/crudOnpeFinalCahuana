package crud.onpe.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.onpe.model.GrupoVotacionNumero;
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
}
