package kg.megacom.Mugalimdemo.controllers;

import kg.megacom.Mugalimdemo.models.Response.Response;
import kg.megacom.Mugalimdemo.models.dto.OrderDto;
import kg.megacom.Mugalimdemo.models.dto.OrderSubscriberDto;
import kg.megacom.Mugalimdemo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/sending")
    public Response sendOrder(@RequestBody OrderSubscriberDto orderSubscriberDto) {
        System.out.println("Вход " + orderSubscriberDto);
        return orderService.saveOrder(orderSubscriberDto);
    }

    @GetMapping("/getOrdersWhereStatusNew")
    public List<OrderDto> getOrdersWhereStatusNew() {
        return orderService.getAllOrdersWithStatusNew();
    }

    @GetMapping("/getAllOrders")
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping("/processingOrder")
    public Response processingOrder(@RequestParam Long ord_id) { // id order
        return orderService.processingOrder(ord_id);
    }

    @PostMapping("/acceptOrder")
    public Response acceptOrder(@RequestParam Long sub_id) { // id subs
        return orderService.acceptOrder(sub_id);
    }

    @PostMapping("/rejectOrder") // id subs
    public Response rejectOrder(@RequestParam Long sub_id, @RequestParam String comment) {
        return orderService.rejectOrder(sub_id, comment);
    }
}