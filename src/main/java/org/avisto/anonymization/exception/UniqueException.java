package org.avisto.anonymization.exception;

public class UniqueException extends RuntimeException{
    public UniqueException(String message) {
        super(message);
    }

    public UniqueException(String message, Throwable e) {
        super(message, e);
    }

    public UniqueException(Throwable e) {
        super(e);
    }
}
