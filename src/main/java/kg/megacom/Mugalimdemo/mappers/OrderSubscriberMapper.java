package kg.megacom.Mugalimdemo.mappers;

import kg.megacom.Mugalimdemo.models.dto.OrderDto;
import kg.megacom.Mugalimdemo.models.dto.OrderSubscriberDto;
import kg.megacom.Mugalimdemo.models.dto.SubscriberDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderSubscriberMapper {
    OrderSubscriberMapper INSTANCE = Mappers.getMapper(OrderSubscriberMapper.class);

    OrderDto toOrderDto(OrderSubscriberDto orderSubscriberDto);
    SubscriberDto toSubscriberDto(OrderSubscriberDto orderSubscriberDto);
}
