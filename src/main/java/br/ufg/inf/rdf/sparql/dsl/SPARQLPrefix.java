package br.ufg.inf.rdf.sparql.dsl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import br.ufg.inf.acmcs.ACMCS;

/**
 * Enumerado contendo os prefixos que serão usados nas queries do trabalho
 * 
 * @created 20/11/2013
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
@AllArgsConstructor
public enum SPARQLPrefix {

    /**
     * Representação com prefixo e URI completa para ACM CS
     */
    ACM_CS("acmcs", ACMCS.NS),

    /**
     * Representação com prefixo e URI completa para FOAF
     */
    FOAF("foaf", com.hp.hpl.jena.sparql.vocabulary.FOAF.NS);

    @Getter
    private String prefix;

    @Getter
    private String uri;

    @Override
    public String toString() {
        return "URI: " + getUri() + " - PREFIX: " + getPrefix();
    }

}
