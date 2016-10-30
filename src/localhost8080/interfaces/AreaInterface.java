/*
 * BrexitElectionAreas
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/30/2016
 */
package localhost8080.interfaces;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import localhost8080.models.*;

public interface AreaInterface {
    /**
     * A single EU election Area
     * @param    id    Required parameter: ID of the requested Area
	 * @return	Returns the AreaObject response from the API call*/
    @GET
    @Path("/areas/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public AreaObject getAreaAsync(
            @PathParam("id") String id);
}