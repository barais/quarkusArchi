package fr.istic.mapper;


import java.util.List;

import org.mapstruct.Mapper;
 
import fr.istic.domain.Gift;
import fr.istic.dto.GiftDTO;

@Mapper(config = QuarkusMappingConfig.class)
public interface GiftMapper {

    GiftDTO toDto(Gift gift);

    List<GiftDTO> giftsToGiftDtos(List<Gift> cars);

    Gift toEntity(GiftDTO giftDTO);
}