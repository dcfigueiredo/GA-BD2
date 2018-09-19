//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.09.19 às 06:02:11 PM BRT 
//


package com.unisinos.casafesta.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Ingresso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Ingresso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="integrante" type="{/jaxb/gen}Integrante" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ingresso", propOrder = {
    "id",
    "categoria",
    "preco",
    "integrante"
})
public class Ingresso {

    protected long id;
    @XmlElement(required = true)
    protected String categoria;
    protected double preco;
    protected Integrante integrante;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define o valor da propriedade categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     */
    public void setPreco(double value) {
        this.preco = value;
    }

    /**
     * Obtém o valor da propriedade integrante.
     * 
     * @return
     *     possible object is
     *     {@link Integrante }
     *     
     */
    public Integrante getIntegrante() {
        return integrante;
    }

    /**
     * Define o valor da propriedade integrante.
     * 
     * @param value
     *     allowed object is
     *     {@link Integrante }
     *     
     */
    public void setIntegrante(Integrante value) {
        this.integrante = value;
    }

}
