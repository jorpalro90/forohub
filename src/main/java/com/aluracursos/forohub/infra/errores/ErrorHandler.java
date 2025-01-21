package com.aluracursos.forohub.infra.errores;

import com.aluracursos.forohub.domain.ValidacionExcepcion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(ValidacionExcepcion.class)
    public ResponseEntity<ErrorResponse> handleValidacionExcepcion(ValidacionExcepcion ex) {
        ErrorResponse errorResponse = new ErrorResponse(
                ex.getMessage(),
                ex.getCodigoError() != null ? ex.getCodigoError() : "ERROR_DESCONOCIDO"
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    // Clase auxiliar para la respuesta
    public static class ErrorResponse {
        private String mensaje;
        private String codigo;

        public ErrorResponse(String mensaje, String codigo) {
            this.mensaje = mensaje;
            this.codigo = codigo;
        }

        public String getMensaje() {
            return mensaje;
        }

        public String getCodigo() {
            return codigo;
        }
    }
}
