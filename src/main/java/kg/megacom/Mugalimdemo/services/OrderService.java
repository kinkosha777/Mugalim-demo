package kg.megacom.Mugalimdemo.services;

import kg.megacom.Mugalimdemo.models.Response.Response;
import kg.megacom.Mugalimdemo.models.dto.OrderDto;
import kg.megacom.Mugalimdemo.models.dto.OrderSubscriberDto;

import java.util.List;

public interface OrderService {
    Response saveOrder(OrderSubscriberDto orderSubscriberDto);
    List<OrderDto> getAllOrders();

    List<OrderDto> getAllOrdersWithStatusNew();

    Response processingOrder(Long id);

    Response acceptOrder(Long id);

    Response rejectOrder(Long id, String comment);
}
