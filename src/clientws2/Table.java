package clientws2;

import org.simpleframework.xml.Element;

/**
 *
 * @author sldia
 */
public class Table {

    @Element(required = false)
    private int AtomicNumber;
    @Element(required = false)
    private String ElementName;
    @Element(required = false)
    private String Symbol;
    @Element(required = false)
    private double AtomicWeight;
    @Element(required = false)
    private int BoilingPoint;
    @Element(required = false)
    private double IonisationPotential;
    @Element(required = false)
    private double EletroNegativity;
    @Element(required = false)
    private double AtomicRadius;
    @Element(required = false)
    private int MeltingPoint;
    @Element(required = false)
    private int Density;

    public Table() {
        super();
    }

    public Table(int AtomicNumber, String ElementName, String Symbol, double AtomicWeight, int BoilingPoint, double IonisationPotential, double EletroNegativity, double AtomicRadius, int MeltingPoint, int Density) {
        this.AtomicNumber = AtomicNumber;
        this.ElementName = ElementName;
        this.Symbol = Symbol;
        this.AtomicWeight = AtomicWeight;
        this.BoilingPoint = BoilingPoint;
        this.IonisationPotential = IonisationPotential;
        this.EletroNegativity = EletroNegativity;
        this.AtomicRadius = AtomicRadius;
        this.MeltingPoint = MeltingPoint;
        this.Density = Density;
    }

    public int getAtomicNumber() {
        return AtomicNumber;
    }

    public String getElementName() {
        return ElementName;
    }

    public String getSymbol() {
        return Symbol;
    }

    public double getAtomicWeight() {
        return AtomicWeight;
    }

    public int getBoilingPoint() {
        return BoilingPoint;
    }

    public double getIonisationPotential() {
        return IonisationPotential;
    }

    public double getEletroNegativity() {
        return EletroNegativity;
    }

    public double getAtomicRadius() {
        return AtomicRadius;
    }

    public int getMeltingPoint() {
        return MeltingPoint;
    }

    public int getDensity() {
        return Density;
    }

}
