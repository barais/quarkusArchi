package fr.istic.rest;

import java.util.List;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.istic.domain.Gift;
import fr.istic.dto.GiftDTO;
import fr.istic.mapper.GiftMapper;
import fr.istic.repository.GiftRepository;

@Path("/api/gifts")
public class GiftResource {

    @Inject
    GiftRepository giftRepository;
    @Inject
    GiftMapper giftMapper;
 

    @GET
    @RolesAllowed("user")
    @Produces(MediaType.APPLICATION_JSON)
    public List<GiftDTO> allGifts() {
        return giftMapper.giftsToGiftDtos(giftRepository.findAll().list());
    }
}