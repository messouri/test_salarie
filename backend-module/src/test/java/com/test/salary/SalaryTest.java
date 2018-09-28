package com.test.salary;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.business.SalaryBusiness;

/**
 * test de la couche business pour le CR de salary.
 * @author mohammed.essouri
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SalaryBusiness.class)
public class SalaryTest {
	
	@Autowired
	private SalaryBusiness salaryBusiness;
	
	@Test
	public void saveListSalaryTest() {
		// test de la sauvegarde de la liste des salariees.
	}
	
	@Test
	public void getAllSalaryTest() {
		// test de la récuppération de la liste des salariés dédoublonée.
	}

}
