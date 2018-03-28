package com.allardworks.workinator3.demorabbitmq;

import com.allardworks.workinator3.consumer.WorkinatorConsumer;
import com.allardworks.workinator3.contracts.ConsumerId;
import com.allardworks.workinator3.core.NameUtility;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.allardworks.workinator3")
public class DemoRabbitmqApplication {

	public static void main(String[] args) {
		val context = SpringApplication.run(DemoRabbitmqApplication.class, args);
		val consumerId = context.getBean(ConsumerId.class);
		System.out.println(consumerId.getName());
		//val consumer = context.getBean(WorkinatorConsumer.class);
		//val name = NameUtility.getRandomName();
		//consumer.start();
		//System.out.println("Consumer started");
	}
}
