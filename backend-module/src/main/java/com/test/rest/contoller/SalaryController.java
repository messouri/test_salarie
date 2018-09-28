package com.test.rest.contoller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.business.SalaryBusiness;
import com.test.dto.SalaryDto;

/**
 * contoleur qui expose l'api rest.
 * 
 * @author mohammed.essouri
 *
 */
@RestController
@RequestMapping("/api")
public class SalaryController {

	@Autowired
	private SalaryBusiness salaryBusiness;

	/**
	 * retoure la liste des salariés.
	 * 
	 * @return
	 */
	@GetMapping("/deduplicate-salaries")
	public Map<Integer, String> getDeduplcateSalary() {
		return salaryBusiness.getAllSalary();
	}

	/**
	 * sauvegarde une liste des salariés.
	 * 
	 * @return
	 */
	@GetMapping("/save-salaries")
	public void saveListSalary(@RequestBody List<SalaryDto> listSalaryDto) {
		salaryBusiness.saveListSalary(listSalaryDto);
	}

}
