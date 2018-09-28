package com.test.util;

import com.test.dto.SalaryDto;
import com.test.entity.Salary;

public class SalaryConverter {

	public static Salary dtoToEntity(SalaryDto salaryDto) {
		return new Salary(null, salaryDto.getName());
	}

	public static SalaryDto entityToDto(Salary salary) {
		return new SalaryDto(salary.getName(), salary.getId());
	}

}
