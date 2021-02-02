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

import formation.ib.backend.entities.Theme;
import formation.ib.backend.services.ThemeService;

@RequestMapping("themes")
@RestController
@CrossOrigin
public class ThemeController {
	
	@Autowired
	private ThemeService themeService;

	@GetMapping("")
	public List<Theme> findAll(){
		return this.themeService.findAll();
	}
	
	@PostMapping("")
	public Theme save(@RequestBody Theme entity) {
		return themeService.save(entity);
	}
	
	@GetMapping("nom/{nom}")
	public List<Theme> findByNom(@PathVariable String nom){
		return themeService.findByNom(nom);
	}

	@GetMapping("{id}")
	public Theme findById(@PathVariable Long id) {
		return themeService.findById(id);
	}
	
}
