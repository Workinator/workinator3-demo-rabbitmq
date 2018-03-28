package com.allardworks.workinator3.demorabbitmq;

import com.allardworks.workinator3.consumer.rabbitmq.raw.RabbitMqRawWorker;
import com.allardworks.workinator3.contracts.WorkerContext;
import com.rabbitmq.client.Channel;

public class DemoWorker implements RabbitMqRawWorker {
    @Override
    public void processMessage(WorkerContext context, Channel channel) {

    }
}
