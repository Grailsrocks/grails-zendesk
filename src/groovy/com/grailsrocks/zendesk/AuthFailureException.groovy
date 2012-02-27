package com.grailsrocks.zendesk

class AuthFailureException extends RuntimeException {
    AuthFailureException(String msg) {
        super(msg)
    }
}