
package com.ttdev.biz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ttdev.biz package. 
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

    private final static QName _ProductQuery_QNAME = new QName("http://svashishtha.com/ws", "productQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ttdev.biz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductQueryResult }
     * 
     */
    public ProductQueryResult createProductQueryResult() {
        return new ProductQueryResult();
    }

    /**
     * Create an instance of {@link ProductQueryComplexType }
     * 
     */
    public ProductQueryComplexType createProductQueryComplexType() {
        return new ProductQueryComplexType();
    }

    /**
     * Create an instance of {@link ProductQueryResult.ResultItem }
     * 
     */
    public ProductQueryResult.ResultItem createProductQueryResultResultItem() {
        return new ProductQueryResult.ResultItem();
    }

    /**
     * Create an instance of {@link ProductQueryComplexType.QueryItem }
     * 
     */
    public ProductQueryComplexType.QueryItem createProductQueryComplexTypeQueryItem() {
        return new ProductQueryComplexType.QueryItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductQueryComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svashishtha.com/ws", name = "productQuery")
    public JAXBElement<ProductQueryComplexType> createProductQuery(ProductQueryComplexType value) {
        return new JAXBElement<ProductQueryComplexType>(_ProductQuery_QNAME, ProductQueryComplexType.class, null, value);
    }

}
