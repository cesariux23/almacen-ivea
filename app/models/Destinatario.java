package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Destinatario extends Model {
    // Properties
    @Id
    public int id;
    public String nombre;
    public int direccion;
    public String ciudad;
    public float telefono;

    //Global definition for find helper (Ebean implementation)
    public static final Finder<String, Destinatario> find = new Finder<> (Destinatario.class);
}