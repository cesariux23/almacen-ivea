package controllers;

import play.mvc.*;
import models.*;
import java.util.List;

//for json response
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ArticuloController extends Controller {

    public Result list() {
        List<Articulo> articulos = Articulo.find.all();
        return ok(views.html.articulos.index.render(articulos));
    }

    public Result show(String id) {
        Articulo articulo = Articulo.find.byId(id);
        if(articulo == null) {
            return status(404, "no encontrado");
        }
        JsonNode json = Json.toJson(articulo);
        return ok(json);
        
    }

/*

    public Result create() {
        return ok(views.html.articulos.form.render(articulos));
        
    }

    public Result store(Http.Request request) {
        JsonNode json = request.body
        Articulo articulo = Articulo.find.byId(id);
        if(articulo == null) {
            return status(404, "no encontrado");
        }
        JsonNode json = Json.toJson(articulo);
        return ok(json);
        
    }
    */

}