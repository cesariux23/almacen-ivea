package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Articulo extends Model {
    // Properties
    @Id
    public String clave;
    public String descripcion;
    public int grupo;
    public String unidad;
    public float costo;
    public int existencia;
    public int proveedor;

    //Global definition for find helper (Ebean implementation)
    public static final Finder<String, Articulo> find = new Finder<> (Articulo.class);
}