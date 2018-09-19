//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.09.19 às 06:02:11 PM BRT 
//


package com.unisinos.casafesta.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unisinos.casafesta.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Promocao_QNAME = new QName("/jaxb/gen", "promocao");
    private final static QName _Festa_QNAME = new QName("/jaxb/gen", "festa");
    private final static QName _Ingresso_QNAME = new QName("/jaxb/gen", "ingresso");
    private final static QName _Integrante_QNAME = new QName("/jaxb/gen", "integrante");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unisinos.casafesta.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Promocao }
     * 
     */
    public Promocao createPromocao() {
        return new Promocao();
    }

    /**
     * Create an instance of {@link Festa }
     * 
     */
    public Festa createFesta() {
        return new Festa();
    }

    /**
     * Create an instance of {@link Ingresso }
     * 
     */
    public Ingresso createIngresso() {
        return new Ingresso();
    }

    /**
     * Create an instance of {@link Integrante }
     * 
     */
    public Integrante createIntegrante() {
        return new Integrante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Promocao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Promocao }{@code >}
     */
    @XmlElementDecl(namespace = "/jaxb/gen", name = "promocao")
    public JAXBElement<Promocao> createPromocao(Promocao value) {
        return new JAXBElement<Promocao>(_Promocao_QNAME, Promocao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Festa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Festa }{@code >}
     */
    @XmlElementDecl(namespace = "/jaxb/gen", name = "festa")
    public JAXBElement<Festa> createFesta(Festa value) {
        return new JAXBElement<Festa>(_Festa_QNAME, Festa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingresso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ingresso }{@code >}
     */
    @XmlElementDecl(namespace = "/jaxb/gen", name = "ingresso")
    public JAXBElement<Ingresso> createIngresso(Ingresso value) {
        return new JAXBElement<Ingresso>(_Ingresso_QNAME, Ingresso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integrante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integrante }{@code >}
     */
    @XmlElementDecl(namespace = "/jaxb/gen", name = "integrante")
    public JAXBElement<Integrante> createIntegrante(Integrante value) {
        return new JAXBElement<Integrante>(_Integrante_QNAME, Integrante.class, null, value);
    }

}
