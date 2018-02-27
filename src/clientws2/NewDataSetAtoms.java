package clientws2;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author sergio
 */
@Root(name = "NewDataSet")
public class NewDataSetAtoms {
    
    @ElementList(inline = true)
    private List<TableAtoms> list;
    
    public NewDataSetAtoms() {
        super();
    }

    public NewDataSetAtoms(List<TableAtoms> atoms) {
        this.list = atoms;
    }

    public List<TableAtoms> getList() {
        return list;
    }

}

