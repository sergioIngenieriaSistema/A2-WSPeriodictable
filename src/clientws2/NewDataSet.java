package clientws2;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author sergio
 */
@Root
public class NewDataSet {
    
    @Element(required = false)
    private Table Table;
    
    public NewDataSet() {
        super();
    }

    public NewDataSet(Table table, List<Table> atoms) {
        this.Table = table;
    }

    public Table getTable() {
        return Table;
    }
    
}

