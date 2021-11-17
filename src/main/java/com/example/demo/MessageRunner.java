package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MessageRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("this spring boot Application....");
		System.out.println("this modified file..");
		System.out.println("this is developer branch do you know this..");
		
		System.out.println("this is developer branch do you know this.. 2nd one");
		

		System.out.println("this is developer branch 3rd commit..remote edit..");

	}

}
