package uz.pdp.market.exception.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class InvalidTokenException extends RuntimeException{
    private final HttpStatus status;

    public InvalidTokenException(String message) {
        this(message, HttpStatus.BAD_REQUEST);
    }

    public InvalidTokenException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
