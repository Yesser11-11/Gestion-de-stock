package com.example.demo1.Service;

import java.util.List;

import com.example.demo1.model.*;

public interface FournissuerService {

 public List<Fournisseur> getAllFournisseurs();
 
 public Fournisseur getFournisseurById(long id);
 
 public void saveOrUpdate(Fournisseur fournisseur);
 
 public void deleteFournisseur(long id);
}