package com.capgemini.camel.exception.data;

import com.capgemini.camel.exception.core.IrrecoverableException;

/**
 * Cache-related Exception.
 *
 * @author Abbas Attarwala
 */
public class CacheException extends IrrecoverableException {

    /**
     * Constructor with message arg
     * @param message with message
     */
    public CacheException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message the message
     * @param cause the Throwable that caused this exception
     */
    public CacheException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
}
