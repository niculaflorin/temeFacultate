
package mds.servicii;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mds.servicii package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mds.servicii
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Presiune }
     * 
     */
    public Presiune createPresiune() {
        return new Presiune();
    }

    /**
     * Create an instance of {@link PresiuneResponse }
     * 
     */
    public PresiuneResponse createPresiuneResponse() {
        return new PresiuneResponse();
    }

    /**
     * Create an instance of {@link Moli }
     * 
     */
    public Moli createMoli() {
        return new Moli();
    }

    /**
     * Create an instance of {@link MoliResponse }
     * 
     */
    public MoliResponse createMoliResponse() {
        return new MoliResponse();
    }

    /**
     * Create an instance of {@link GazIdeal }
     * 
     */
    public GazIdeal createGazIdeal() {
        return new GazIdeal();
    }

    /**
     * Create an instance of {@link GazIdealResponse }
     * 
     */
    public GazIdealResponse createGazIdealResponse() {
        return new GazIdealResponse();
    }

}
