package com.example.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdLineRunner implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command line Runner run() called");	
	}
}
