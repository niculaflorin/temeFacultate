
package mds.servicii;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="miu" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="g" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "miu",
    "masa",
    "g"
})
@XmlRootElement(name = "getFortaFrecare")
public class GetFortaFrecare {

    protected double miu;
    protected double masa;
    protected double g;

    /**
     * Gets the value of the miu property.
     * 
     */
    public double getMiu() {
        return miu;
    }

    /**
     * Sets the value of the miu property.
     * 
     */
    public void setMiu(double value) {
        this.miu = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     */
    public double getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     */
    public void setMasa(double value) {
        this.masa = value;
    }

    /**
     * Gets the value of the g property.
     * 
     */
    public double getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     */
    public void setG(double value) {
        this.g = value;
    }

}
