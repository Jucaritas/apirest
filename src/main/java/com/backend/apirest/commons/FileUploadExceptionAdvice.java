package com.backend.apirest.commons;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import com.backend.apirest.model.Response;

@ControllerAdvice
public class FileUploadExceptionAdvice {

	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public ResponseEntity<Response> handleMaxSizeException(MaxUploadSizeExceededException ex)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Response("Verifica el tamaño de los archivos!"));
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> handleException(Exception e)
	{
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response("Se ha generado un error al procesar tu petición!"));
	}
}
