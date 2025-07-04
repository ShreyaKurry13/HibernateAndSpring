package cars_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarNotFoundException extends RuntimeException{
	
	public CarNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
