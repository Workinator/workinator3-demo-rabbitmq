package com.allardworks.workinator3.demorabbitmq;

import com.allardworks.workinator3.consumer.rabbitmq.PartitionQueue;
import com.allardworks.workinator3.consumer.rabbitmq.QueueResolver;
import com.allardworks.workinator3.core.Assignment;
import org.springframework.stereotype.Component;

@Component
public class DemoQueueResolver implements QueueResolver {
    @Override
    public PartitionQueue getQueueForPartition(Assignment assignment) {
        return PartitionQueue
                .builder()
                .queueName("Client-" + assignment.getPartitionKey())
                .routingKey(assignment.getPartitionKey())
                .exchangeName("Demo")
                .exchangeType("TOPIC")
                .build();
    }
}
