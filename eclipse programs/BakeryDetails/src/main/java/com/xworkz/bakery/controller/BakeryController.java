package main.java.com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import main.java.com.xworkz.bakery.dto.BakeryDTO;
import main.java.com.xworkz.bakery.service.BakeryService;

@Component
@RequestMapping("/bakery")
public class BakeryController {

	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBakery(BakeryDTO dto,Model model) {
		System.out.println("running onBakery"+dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("owner", dto.getOwner());
		model.addAttribute("wife", dto.getWife());
		model.addAttribute("married", dto.isMarried());
		model.addAttribute("famousFor", dto.getFamousFor());
		model.addAttribute("since", dto.getSince());
		boolean saved=this.bakeryService.validateAndSave(dto);
		System.out.println("saved"+saved);
		
		return "BakerySuccess.jsp";
	}
	
	
}
