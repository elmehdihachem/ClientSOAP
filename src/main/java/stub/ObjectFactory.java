
package stub;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _GetEtudiants_QNAME = new QName("http://serveur/", "getEtudiants");
    private static final QName _GetEtudiantsResponse_QNAME = new QName("http://serveur/", "getEtudiantsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEtudiants }
     * 
     * @return
     *     the new instance of {@link GetEtudiants }
     */
    public GetEtudiants createGetEtudiants() {
        return new GetEtudiants();
    }

    /**
     * Create an instance of {@link GetEtudiantsResponse }
     * 
     * @return
     *     the new instance of {@link GetEtudiantsResponse }
     */
    public GetEtudiantsResponse createGetEtudiantsResponse() {
        return new GetEtudiantsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     * @return
     *     the new instance of {@link Student }
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiants }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEtudiants }{@code >}
     */
    @XmlElementDecl(namespace = "http://serveur/", name = "getEtudiants")
    public JAXBElement<GetEtudiants> createGetEtudiants(GetEtudiants value) {
        return new JAXBElement<>(_GetEtudiants_QNAME, GetEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEtudiantsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serveur/", name = "getEtudiantsResponse")
    public JAXBElement<GetEtudiantsResponse> createGetEtudiantsResponse(GetEtudiantsResponse value) {
        return new JAXBElement<>(_GetEtudiantsResponse_QNAME, GetEtudiantsResponse.class, null, value);
    }

}
