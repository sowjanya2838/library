package com.innobyte.app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innobyte.app1.model.BookCategories;


@Repository
public interface BookCategoriesRepository extends JpaRepository<BookCategories, Integer>{

}
