package com.restws.springsecurity;

import com.restws.springsecurity.model.Product;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import java.util.List;

@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/productservice") // Used by the client to access the web service.
public interface ProductService {

    @Path("/products")
    @GET
    List<Product> getProducts();

    @Path("/products")
    @POST
    long addProduct(Product product);
}
