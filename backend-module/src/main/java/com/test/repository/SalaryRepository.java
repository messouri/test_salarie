package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Salary;

/**
 * interface salary repository herite de la classe JpaRepository.
 * @author mohammed.essouri
 *
 */
@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
