package controllers;

import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.details;
import views.html.products.list;

import java.util.List;

/**
 * Created by twer on 9/1/15.
 */
public class Products extends Controller {

    private static final Form<Product> productForm = Form.form(Product.class);

    public Result list() {
        List<Product> products = Product.findAll();
        return ok(list.render(products));
    }

    public Result newProduct() {
        return ok(details.render(productForm));
    }

    public Result details(String ean) {
        return TODO;
    }

    public Result save() {
        return TODO;
    }
}
