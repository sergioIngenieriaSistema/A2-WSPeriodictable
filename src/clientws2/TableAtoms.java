package clientws2;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author sldia
 */
@Root(name = "Table")
public class TableAtoms {

    @Element
    private String ElementName;

    public TableAtoms() {
        super();
    }

    public TableAtoms(String ElementName) {
        this.ElementName = ElementName;
    }

    public String getElementName() {
        return ElementName;
    }

}
