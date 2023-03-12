package gt.edu.umg.progra3.parcial1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticStructureManager<T> {

    T[] values ;

    public StaticStructureManager(T[] values) {
        this.values = values;
    }

    public T[] ordenar(){

        Arrays.sort(values);

        return values;
    }

    public T[] ordenarInversa(){

        Arrays.sort(values);

        List<T> listaTemporal = Arrays.asList(values);

        Collections.reverse(listaTemporal);

        return listaTemporal.toArray(values);
    }

}