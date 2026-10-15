package br.com.william.restwithspringbootandjavawilliam.expection;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
