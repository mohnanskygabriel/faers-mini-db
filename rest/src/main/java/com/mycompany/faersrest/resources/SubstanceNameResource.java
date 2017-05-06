/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.resources;

import com.mycompany.faersrest.model.SubstanceName;
import com.mycompany.faersrest.services.SubstanceNameService;
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
@Path("/substancename")
public class SubstanceNameResource {    
    SubstanceNameService substanceNameService = new SubstanceNameService();
    
    @GET
    @Path("/{substanceName}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SubstanceName> getBrandNames(@PathParam("substanceName") String name){
        return substanceNameService.getSubstanceName(name); 
    }
}
