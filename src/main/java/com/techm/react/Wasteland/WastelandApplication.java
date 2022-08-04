package com.techm.react.Wasteland;

import com.techm.react.Wasteland.controller.AlbumController;
import com.techm.react.Wasteland.controller.SongController;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan({"com.server", "com.server.config"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class WastelandApplication {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(WastelandApplication.class, args);

		AlbumController albumController = new AlbumController();
		System.out.println(albumController.findAllSongs());
	}

}
