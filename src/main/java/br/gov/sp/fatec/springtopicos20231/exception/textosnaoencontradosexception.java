package br.gov.sp.fatec.springtopicos20231.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class textosnaoencontradosexception extends IllegalArgumentException {

    public textosnaoencontradosexception() {
        super();
    }

    public textosnaoencontradosexception(String message) {
        super(message);
    }

}