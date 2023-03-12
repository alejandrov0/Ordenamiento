package gt.edu.umg.progra3.parcial1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager<T> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){

        values.sort(null);

        return values;
    }

    public List<T> ordenarInversa(){

        values.sort(null);

        Collections.reverse(values);

        return values;
    }

}
