package mx.edu.ittepic.reciclerviewcardview_iris;

import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OEM on 25/02/2018.
*/

public class ObraMusical {
    String nombre;
    String descripcion;
    int imagen;

    ObraMusical (String nombre, String descripcion, int imagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    private List<ObraMusical> obraMusicalList;

    private void initializeData(){
        obraMusicalList = new ArrayList<>();
        obraMusicalList.add(new ObraMusical("Rock Alternativo", "Queen", R.drawable.uno));
        obraMusicalList.add(new ObraMusical("Rock Alternativo", "Queen", R.drawable.dos));
        obraMusicalList.add(new ObraMusical("Rock Alternativo", "Queen", R.drawable.tres));
        obraMusicalList.add(new ObraMusical("Rock Alternativo", "Queen", R.drawable.cuatro));
        obraMusicalList.add(new ObraMusical("Rock Alternativo", "Queen", R.drawable.cinco));
        obraMusicalList.add(new ObraMusical("Rock Alternativo", "Queen", R.drawable.seis));
        obraMusicalList.add(new ObraMusical("Rock Alternativo", "Queen", R.drawable.siete));
        obraMusicalList.add(new ObraMusical("Rock Alternativo", "Queen", R.drawable.ocho));

    }
}
