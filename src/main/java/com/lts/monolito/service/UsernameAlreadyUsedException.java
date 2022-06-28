package com.lts.monolito.service;

public class UsernameAlreadyUsedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UsernameAlreadyUsedException() {
        super("Login name already used!");
    }
}
