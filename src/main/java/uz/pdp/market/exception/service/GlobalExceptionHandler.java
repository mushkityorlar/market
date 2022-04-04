package uz.pdp.market.exception.service;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import uz.pdp.market.response.ApplicationError;

import java.io.IOException;
import java.lang.annotation.Annotation;

@RestController
@ControllerAdvice("uz.pdp.market")
public class GlobalExceptionHandler implements ExceptionHandler {

    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ApplicationError invalidTokenExceptionHandler(InvalidTokenException e, WebRequest request) {
        return ApplicationError.builder()
                .message(e.getMessage())
                .request(request)
                .status(HttpStatus.BAD_REQUEST)
                .build();
    }

    @Override
    public Class<? extends Throwable>[] value() {
        return new Class[0];
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
