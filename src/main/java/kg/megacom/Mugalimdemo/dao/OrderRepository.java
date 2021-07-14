package kg.megacom.Mugalimdemo.dao;

import kg.megacom.Mugalimdemo.enums.OrderStatus;
import kg.megacom.Mugalimdemo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    Order findByEndDateAndSubscriberSubsId(Date end_date, Long id);

    List<Order> findAllByOrderStatusAndEndDate(OrderStatus orderStatus, Date date);

    Order findByEndDateAndOrderStatusAndSubscriberSubsId(Date date, OrderStatus orderStatus, Long id);
}
