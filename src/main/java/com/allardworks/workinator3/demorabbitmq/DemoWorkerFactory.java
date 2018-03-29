package com.allardworks.workinator3.demorabbitmq;

import com.allardworks.workinator3.consumer.rabbitmq.raw.RabbitMqRawWorker;
import com.allardworks.workinator3.consumer.rabbitmq.raw.RabbitMqRawWorkerFactory;
import com.allardworks.workinator3.core.Assignment;
import org.springframework.stereotype.Component;

@Component
public class DemoWorkerFactory implements RabbitMqRawWorkerFactory {
    @Override
    public RabbitMqRawWorker createWorker(Assignment assignment) {
        return null;
    }
}
