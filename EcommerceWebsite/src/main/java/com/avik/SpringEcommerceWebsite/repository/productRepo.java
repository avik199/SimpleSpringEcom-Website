package com.avik.SpringEcommerceWebsite.repository;

import com.avik.SpringEcommerceWebsite.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface productRepo extends JpaRepository<Product, UUID> {
    public List<Product> findByNameContainingOrDescriptionContainingOrBrandOrCategory(String name, String description,String Brand, String Category);

}
