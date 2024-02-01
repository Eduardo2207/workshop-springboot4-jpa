package com.eduardo2207.course.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo2207.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
