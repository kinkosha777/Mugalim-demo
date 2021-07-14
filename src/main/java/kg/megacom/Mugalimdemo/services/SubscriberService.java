package kg.megacom.Mugalimdemo.services;

import kg.megacom.Mugalimdemo.models.dto.SubscriberDto;

public interface SubscriberService {
    SubscriberDto getOrCreate(SubscriberDto subscriberDto);

}
