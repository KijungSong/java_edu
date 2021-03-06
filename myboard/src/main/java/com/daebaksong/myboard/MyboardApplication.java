package com.daebaksong.myboard;

import com.daebaksong.ServerInfo;
import com.daebaksong.myboard.listener.StartListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyboardApplication {
//    @Bean
//    public ServerInfo serverInfo(){
//        ServerInfo serverInfo = new ServerInfo();
//        serverInfo.setAddress("localhost");
//        serverInfo.setPort(9999);
//        return serverInfo;
//    }

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(MyboardApplication.class);
		springApplication.addListeners(new StartListener());
		springApplication.run(args);

		//SpringApplication.run(MyboardApplication.class, args);
	}
}
