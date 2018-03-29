package com.allardworks.workinator3.demorabbitmq;

import com.allardworks.workinator3.consumer.WorkerContext;
import com.allardworks.workinator3.consumer.rabbitmq.raw.RabbitMqRawWorker;
import com.rabbitmq.client.Channel;

public class DemoWorker implements RabbitMqRawWorker {
    @Override
    public void processMessage(WorkerContext context, Channel channel) {

    }
}
