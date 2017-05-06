/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.resources;

import com.mycompany.faersrest.model.SideEffects;
import com.mycompany.faersrest.services.SideEffectsService;
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
@Path("/sideeffects")
public class SideEffectsResource {
    SideEffectsService sideEffectsService = new SideEffectsService();
    
    @GET
    @Path("/{brandName}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SideEffects> getBrandNames(@PathParam("brandName") String name){
        return sideEffectsService.getSideEffects(name); 
    }
}
