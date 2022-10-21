package com.example.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long>{
	@Query("select p from Personne p where p.nom = ?1")
	List<Personne> chercherSelonLeNom(String nom);
	
	List<Personne> findByNomAndPrenom(String nom, String prenom);
	
}
