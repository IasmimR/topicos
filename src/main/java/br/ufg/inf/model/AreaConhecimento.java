package br.ufg.inf.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Representação de uma determinada área de conhecimento.
 * 
 * @create 21/11/2013
 * @author Danilo Guimarães - <a href="mailto:danilo.seusaraiva@gmail.com">danilo.seusaraiva@gmail.com</a>
 *
 */
public class AreaConhecimento {
	
	/**
	 * Título da área de conhecimento. Ex.: 'Teoria da Computação'
	 */
	@Getter
	@Setter
	private String titulo;
	
	/**
	 * Descrição mais detalhada da área de conhecimento.
	 */
	@Getter
	@Setter
	private String descricacaoDetalhada;

}
