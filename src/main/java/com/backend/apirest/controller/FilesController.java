package com.backend.apirest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.*;

import com.backend.apirest.model.Response;

@RestController
@RequestMapping("/files")
public class FilesController {

	@PostMapping("/upload")
	public ResponseEntity<Response> uploadFile(@RequestParam("file") MultipartFile file)
	{System.out.print(file);
		if(file != null) 
		{
//			return ResponseEntity.status(HttpStatus.OK).body(new Response("Holy guacamoly!"));
			System.out.println("holi guacamoly!");
		}
		else
		{
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Response("something is wrong!"));
			System.out.println("something is wrong!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(new Response("Holy guacamoly!"));
	}
}
