package br.com.tb.miniprojeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto {
	
	    @Id
        @GeneratedValue(strategy=GerenerationType.IDENTITY)
	    private long id;
	    
		private String nome;
		private String descricao	;
		private String codigoBarras;
		private byte[] foto;
		private double preco;
		private String categoria ;  
		private String destaque;
		private String statusProd;

}
