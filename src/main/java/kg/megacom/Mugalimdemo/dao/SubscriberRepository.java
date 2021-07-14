package kg.megacom.Mugalimdemo.dao;

import kg.megacom.Mugalimdemo.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber,Long> {
    Subscriber findByPhone(String phone);
}
