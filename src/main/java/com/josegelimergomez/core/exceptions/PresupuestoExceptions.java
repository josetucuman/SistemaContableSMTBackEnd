package com.josegelimergomez.core.exceptions;

public class PresupuestoExceptions extends RuntimeException{

    private String msg;

    public PresupuestoExceptions(String msg) {
        this.msg = msg;
    }

    public PresupuestoExceptions() {

    }
}
