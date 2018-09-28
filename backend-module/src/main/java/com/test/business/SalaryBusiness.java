package com.test.business;

import java.util.List;
import java.util.Map;

import com.test.dto.SalaryDto;

/**
 * classe salary business.
 * 
 * @author mohammed.essouri
 *
 */
public interface SalaryBusiness {

	/**
	 * méthode qui sauvegarde liste de salarie.
	 * 
	 * @return
	 */
	public void saveListSalary(List<SalaryDto> listSalary);
	
	/**
	 * méthode qui retourne la liste de salarie.
	 * 
	 * @return
	 */
	public Map<Integer, String> getAllSalary();

}
