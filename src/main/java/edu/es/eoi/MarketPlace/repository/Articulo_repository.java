package edu.es.eoi.MarketPlace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.MarketPlace.entity.Articulo;

@Repository
public interface Articulo_repository extends JpaRepository <Articulo, Integer> {
	
	public List <Articulo> findByNombreContaining (String nombre);

}
