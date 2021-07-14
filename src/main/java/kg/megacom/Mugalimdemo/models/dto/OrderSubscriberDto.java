package kg.megacom.Mugalimdemo.models.dto;

import kg.megacom.Mugalimdemo.enums.OrderStatus;
import lombok.Data;

import java.util.Date;
@Data
public class OrderSubscriberDto {
    private Long id;
    private String schoolName;
    private String schoolAddress;
    private Date addDate;
    private Date endDate;
    private Date naviDate;
    private String comment;
    private SubscriberDto subscriber;
    private OrderStatus orderStatus;
}
