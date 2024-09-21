package com.choucair.emuns;

public enum MsgError {

    MSG_ERROR_COMPARE_TEXT("El valor esperado: \"%s\", no corresponde al obtenido.");

    private String msg;

    MsgError(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
