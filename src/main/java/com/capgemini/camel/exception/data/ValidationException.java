package com.capgemini.camel.exception.data;

import com.capgemini.camel.exception.core.IrrecoverableException;

/**
 * Validation Exception.
 *
 * @author Abbas Attarwala
 */
public class ValidationException extends IrrecoverableException {
    
     /**
     * Constructor with message arg
     * @param message 
     */
    public ValidationException(String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message
     * @param cause 
     */
    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
