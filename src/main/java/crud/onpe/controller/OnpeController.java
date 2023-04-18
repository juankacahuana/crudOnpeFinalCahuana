package crud.onpe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import crud.onpe.service.GrupoVotacionService;
import crud.onpe.service.ResumenService;

@Controller
public class OnpeController {
	
	@Autowired
	GrupoVotacionService grupoVotacionService;
	
	@Autowired
	ResumenService resumenService;

	
	@RequestMapping("/actasnumero/{idGrupoVotacion}")
	public String getGrupoVotacion(@Param("idGrupoVotacion") String idGrupoVotacion, Model model) {
	model.addAttribute("actasnumero", grupoVotacionService.getGrupoVotacionNumero(idGrupoVotacion));
	return "actasnumero";
	}

	@RequestMapping("/actas")
	public String actas(){
		return "actas";
	}
	
	@GetMapping("/presidencialgeneral")
	public String presidencialgeneral(Model model){
		model.addAttribute("presidencialgeneral", resumenService.getcahuana());
		return "presidencialgeneral";
	}

	
}
