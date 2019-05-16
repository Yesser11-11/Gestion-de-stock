package com.example.demo1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo1.model.Fournisseur;

public interface FournisseurRepository extends CrudRepository<Fournisseur, Long> {
}
