package br.ufg.inf.acmcs;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * Vocabulário definido para a ACM CS
 * 
 * @created 20/11/2013
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
public final class ACMCS {

    private static Model model = ModelFactory.createDefaultModel();

    /**
     * Namespace do vocabulário ACM CS
     */
    public static final String NS = "http://linkserver.icmc.usp.br/ckonto/acm#";

    /**
     * Namespace do vocabulário como uma string
     * @see #NS
     */
    public static String getURI() {
        return NS;
    }

    /**
     * Namespace do vocabulário como um {@link Resource}
     */
    public static final Resource NAMESPACE = model.createResource(NS);

}
