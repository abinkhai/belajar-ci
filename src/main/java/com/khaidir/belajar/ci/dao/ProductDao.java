package com.khaidir.belajar.ci.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.khaidir.belajar.ci.model.Product;

public interface ProductDao extends PagingAndSortingRepository<Product, String>{

}
