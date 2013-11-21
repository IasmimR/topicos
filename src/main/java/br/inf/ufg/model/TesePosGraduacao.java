package br.inf.ufg.model;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * Representação de uma tese de pós-graduação.
 * 
 * @create 21/11/2013
 * @author Danilo Guimarães - <a href="mailto:danilo.seusaraiva@gmail.com">danilo.seusaraiva@gmail.com</a>
 */
public class TesePosGraduacao {
	
	/**
	 * Título do tese de pós-graduacao.
	 */
	@Getter
	@Setter
	private String titulo;
	
	/**
	 * Membro que irá conduzir a defesa da tese de pós-graduação.
	 */
	@Getter
	@Setter
	private MembroBancaPosGraduacao defensor;
	
	/**
	 * Área de conhecimento principal do trabalho.
	 */
	@Getter
	@Setter
	private AreaConhecimento areaPrincipal;
	
	/**
	 * Conjunto de sub-áreas de conhecimento.
	 */
	@Getter
	@Setter
	private Set<AreaConhecimento> subAreas;
	
	/**
	 * Possíveis candidatos em potencial para defesa da tese.
	 */
	@Getter
	@Setter
	private Set<MembroBancaPosGraduacao> candidatosEmPotencial;

}
