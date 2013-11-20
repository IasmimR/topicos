package br.ufg.inf.acmcs;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Recursos da ACM CS para composição do Vocabulário
 * 
 * @created 20/11/2013
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
@AllArgsConstructor
public enum ACMCSResource {

    TESTE("");

    /**
     * Identificação do recurso do vocabulário
     */
    @Getter
    private String name;

}
