package kg.megacom.Mugalimdemo.models;

import kg.megacom.Mugalimdemo.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String schoolName;
    private String schoolAddress;
    private Date addDate;
    private Date endDate;
    private Date naviDate;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "subscriber_id")
    private Subscriber subscriber;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
