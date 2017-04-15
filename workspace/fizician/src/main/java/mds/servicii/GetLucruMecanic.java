
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
 *         &lt;element name="forta" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dist" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "forta",
    "dist",
    "x"
})
@XmlRootElement(name = "getLucruMecanic")
public class GetLucruMecanic {

    protected double forta;
    protected double dist;
    protected double x;

    /**
     * Gets the value of the forta property.
     * 
     */
    public double getForta() {
        return forta;
    }

    /**
     * Sets the value of the forta property.
     * 
     */
    public void setForta(double value) {
        this.forta = value;
    }

    /**
     * Gets the value of the dist property.
     * 
     */
    public double getDist() {
        return dist;
    }

    /**
     * Sets the value of the dist property.
     * 
     */
    public void setDist(double value) {
        this.dist = value;
    }

    /**
     * Gets the value of the x property.
     * 
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(double value) {
        this.x = value;
    }

}
