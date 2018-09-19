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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Promocao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Promocao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="porcentagemDesconto" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dataFinalVigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dataInicioVigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Promocao", propOrder = {
    "id",
    "porcentagemDesconto",
    "dataFinalVigencia",
    "dataInicioVigencia"
})
public class Promocao {

    protected long id;
    protected long porcentagemDesconto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinalVigencia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicioVigencia;

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
     * Obtém o valor da propriedade porcentagemDesconto.
     * 
     */
    public long getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    /**
     * Define o valor da propriedade porcentagemDesconto.
     * 
     */
    public void setPorcentagemDesconto(long value) {
        this.porcentagemDesconto = value;
    }

    /**
     * Obtém o valor da propriedade dataFinalVigencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinalVigencia() {
        return dataFinalVigencia;
    }

    /**
     * Define o valor da propriedade dataFinalVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinalVigencia(XMLGregorianCalendar value) {
        this.dataFinalVigencia = value;
    }

    /**
     * Obtém o valor da propriedade dataInicioVigencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    /**
     * Define o valor da propriedade dataInicioVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioVigencia(XMLGregorianCalendar value) {
        this.dataInicioVigencia = value;
    }

}
