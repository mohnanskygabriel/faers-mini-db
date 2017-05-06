/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.resources;

import com.mycompany.faersrest.model.ManufacturerName;
import com.mycompany.faersrest.services.ManufacturerNameService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Patrik Rojek
 */
@Path("/manufacturername")
public class ManufacturerNameResource {
    ManufacturerNameService manufacturerNameService = new ManufacturerNameService();
    
    @GET
    @Path("/{manufacturerName}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ManufacturerName> getBrandNames(@PathParam("manufacturerName") String name){
        return manufacturerNameService.getManufacturerName(name); 
    }
}
