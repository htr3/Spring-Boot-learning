package net.javaguides.springboot;

import net.javaguides.springboot.entity.Wikimedia;
import net.javaguides.springboot.repository.WikiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    private WikiRepository datarepository;

    public KafkaDatabaseConsumer(WikiRepository datarepository) {
        this.datarepository = datarepository;
    }

    @KafkaListener(topics = "wikimedia_recentchnge", groupId = "myGroup")
    public void consume(String eventMessage) {
        LOGGER.info(String.format("event message recieved -> %s", eventMessage));

        Wikimedia wikimedia = new Wikimedia();
        wikimedia.setWikidata(eventMessage);

        datarepository.save(wikimedia);
    }


}
