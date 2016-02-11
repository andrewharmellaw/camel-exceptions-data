package com.capgemini.camel.exception.data;

import com.capgemini.camel.exception.core.IrrecoverableException;

/**
 * Transformation Exception.
 *
 * @author Abbas Attarwala
 */
public class TransformationException extends IrrecoverableException {
    
    /**
     * Constructor with message arg
     * @param message 
     */
    public TransformationException(String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * @param message
     * @param cause 
     */
    public TransformationException(String message, Throwable cause) {
        super(message, cause);
    }
}
