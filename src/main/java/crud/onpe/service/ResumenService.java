package crud.onpe.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.onpe.model.resumenelecciones;
import crud.onpe.repository.IResumenGeneral;

@Service
public class ResumenService implements IResumenService{
	
	@Autowired
	private IResumenGeneral iResumenGeneral;

	@Override
	public resumenelecciones getcahuana() {
		// TODO Auto-generated method stub
		return iResumenGeneral.getcahuana();
	}

}
