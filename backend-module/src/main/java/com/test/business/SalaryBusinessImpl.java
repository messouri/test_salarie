package com.test.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.SalaryDto;
import com.test.entity.Salary;
import com.test.repository.SalaryRepository;
import com.test.util.SalaryConverter;

/**
 * classe SalaryBusinessImpl.
 * 
 * @author mohammed.essouri
 *
 */
@Service
public class SalaryBusinessImpl implements SalaryBusiness {

	@Autowired
	SalaryRepository salaryRepository;

	@Override
	public void saveListSalary(List<SalaryDto> listSalary) {

		// conversion de list DTO à objet Entity pour la sauvegarde en BDD
		List<Salary> salaryEntityList = listSalary.stream().map(SalaryConverter::dtoToEntity)
				.collect(Collectors.toList());
		for (Salary salaryEntity : salaryEntityList) {
			salaryRepository.save(salaryEntity);
		}
	}

	@Override
	public Map<Integer, String> getAllSalary() {
		List<SalaryDto> listSalary = salaryRepository.findAll().stream().map(SalaryConverter::entityToDto)
				.collect(Collectors.toList());
		Map<Integer, String> mapSalary = new HashMap<Integer, String>();
		for (SalaryDto salaryDto : listSalary) {
			mapSalary.put(salaryDto.getId(), salaryDto.getName());
		}
		return mapSalary;

	}

}
