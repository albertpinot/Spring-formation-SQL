package formation.ib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Formation;
import formation.ib.backend.services.FormationService;

@RequestMapping("formations")
@RestController
@CrossOrigin
public class FormationController {
	
	@Autowired
	private FormationService formationService;
	
	@GetMapping("")
	public List<Formation> findAll(){
		return this.formationService.findAll();
	}
	
	@PostMapping("")
	public Formation save(@RequestBody Formation entity) {
		return this.formationService.save(entity);
	}

	@GetMapping("titre/{titre}")
	public List<Formation> findByTitre(@PathVariable String titre) {
		return formationService.findByTitre(titre);
	}

	@GetMapping("description/{description}")
	public List<Formation> findByDescription(@PathVariable String description) {
		return formationService.findByDescription(description);
	}
	
	@GetMapping("{id}")
	public Formation findByDescription(@PathVariable Long id) {
		return formationService.findById(id);
	}
}
