package crud.onpe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import crud.onpe.service.GrupoVotacionService;

@Controller
public class OnpeController {
	
	@Autowired
	GrupoVotacionService grupoVotacionService;
	

	
	@RequestMapping("/actasnumero/{idGrupoVotacion}")
	public String getGrupoVotacion(@Param("idGrupoVotacion") String idGrupoVotacion, Model model) {
	model.addAttribute("actasnumero", grupoVotacionService.getGrupoVotacionNumero(idGrupoVotacion));
	return "actasnumero";
	}

	@RequestMapping("/actas")
	public String actas(){
		return "actas";
	}
	
	
}
