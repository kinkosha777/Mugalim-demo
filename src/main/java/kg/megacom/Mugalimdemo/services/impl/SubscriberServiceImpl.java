package kg.megacom.Mugalimdemo.services.impl;

import kg.megacom.Mugalimdemo.dao.SubscriberRepository;
import kg.megacom.Mugalimdemo.mappers.SubscriberMapper;
import kg.megacom.Mugalimdemo.models.Subscriber;
import kg.megacom.Mugalimdemo.models.dto.SubscriberDto;
import kg.megacom.Mugalimdemo.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberServiceImpl implements SubscriberService {
    @Autowired
    SubscriberRepository subscriberRepository;
    @Override
    public SubscriberDto getOrCreate(SubscriberDto subscriberDto) {
    Subscriber subscriberFromDb =subscriberRepository.findByPhone(subscriberDto.getPhone());
    if (subscriberFromDb == null){
        Subscriber subscriberForSave = subscriberRepository.save(SubscriberMapper.INSTANCE.toSubscriber(subscriberDto));
        System.out.println(subscriberForSave);
        return SubscriberMapper.INSTANCE.toSubscriberDto(subscriberForSave);
    }
        return SubscriberMapper.INSTANCE.toSubscriberDto(subscriberFromDb);
    }
}
