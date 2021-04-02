package com.example.spring_crud_upload.model;

import com.example.spring_crud_upload.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.naming.ldap.PagedResultsResponseControl;
import java.util.List;

public interface ProductModel2 extends PagingAndSortingRepository<Product,Integer> {
    Page<Product> findByNameAndPrice(String name, int price, Pageable pageable);

    List<Product> findDistinctByName(String name);
}
