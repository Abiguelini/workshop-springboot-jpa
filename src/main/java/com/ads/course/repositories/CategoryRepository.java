package com.ads.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.course.entities.Category;
import com.ads.course.entities.Order;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
