package br.inf.ufg.model;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * Representação em POJO de um membro da banca de pós-graduação.
 * 
 * <p>
 * Pode se referir tanto ao defensor (autor da tese), quanto a banca em si.
 * <p>
 * Cada membro possui um nome que o identifica, um conjunto de áreas de
 * conhecimento primárias (aquelas que o membro tem mais experiência e
 * familiaridade) e um segundo conjunto composto pelas áreas de conhecimento
 * secundárias.
 * 
 * @create 21/11/2013
 * @author Danilo Guimarães - <a href="mailto:danilo.seusaraiva@gmail.com">danilo.seusaraiva@gmail.com</a>
 * 
 */
public class MembroBancaPosGraduacao {
	
	/**
	 * Nome do caboclo.
	 */
	@Getter
	@Setter
	private String nome;
	
	/**
	 * Conjunto de áreas de conhecimento primárias.
	 */
	@Getter
	@Setter
	Set<AreaConhecimento> areasPrimariasDeConhecimento;
	
	/**
	 * Conjunto de áreas de conhecimento secundárias.
	 */
	@Getter
	@Setter
	Set<AreaConhecimento> areasSecundariasDeConhecimento;

}
