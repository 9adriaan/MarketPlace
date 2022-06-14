//package edu.es.eoi.MarketPlace.entity;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//
//public class Articulo {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	@Column
//	private String nombre;
//	
//	@OneToMany(mappedBy = "articulo", targetEntity = ArticulosPedido.class)
//	private List<ArticulosPedido> articulosPedido;
//
//}

package edu.es.eoi.MarketPlace.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="articulo")
@Getter
@Setter
public class Articulo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idArticle;
	private String name;
	private Double price;
	private Integer stock;

	@OneToMany(mappedBy = "article", targetEntity=ArticulosPedido.class, cascade = CascadeType.ALL)
	private List<Articulospedido> articulospedido;

}
