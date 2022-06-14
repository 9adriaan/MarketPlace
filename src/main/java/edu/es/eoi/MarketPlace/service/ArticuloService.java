//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import edu.es.eoi.MarketPlace.dto.ArticuloDTO;
//import edu.es.eoi.MarketPlace.entity.Articulo;
//import edu.es.eoi.MarketPlace.repository.Articulo_repository;
//
//@Service
//public class ArticuloService {
//	
//	@Autowired
//	private Articulo_repository repository;
//	
//	public ArticuloDTO find(int articulo_id) {
//		
//		Articulo entidad=repository.findById(articulo_id).get();
//		
//		ArticuloDTO dto = new ArticuloDTO();
//		dto.setId(entidad.getId());
//		dto.setNombre(entidad.getNombre());
//		dto.setPrecio(entidad.getPrecio());
//		dto.setStock(entidad.getStock());
//		
//		return dto;
//		
//	}
//
//}

//public List <Articulo> findByNombreContaining (String nombre);


package edu.es.eoi.MarketPlace.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.MarketPlace.entity.Articulo;
import edu.es.eoi.MarketPlace.repository.Articulo_repository;

@Service
public class ArticuloService {
	
	@Autowired
	private Articulo_repository repository;
	
	public Optional<Articulo> findById(int articulo_id)  {
		return repository.findById(articulo_id);
		
	}
	
	public Articulo create(Articulo articulo) {
		return repository.save(articulo);
		
	}
	
	public Articulo update(Articulo articulo) {
		return repository.save(articulo);
	}

}