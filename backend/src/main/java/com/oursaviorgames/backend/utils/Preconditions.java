package com.oursaviorgames.backend.utils;

public class Preconditions {

    /**
    * Ensures that an object reference passed as a parameter to the calling
    * method is not null.
    *
    * @param reference an object reference
    * @param errorMessage the exception message to use if the check fails; will
    *     be converted to a string using {@link String#valueOf(Object)}
    * @return the non-null reference that was validated
    * @throws IllegalArgumentException if {@code reference} is null
    */
    public static <T> T checkNotNull(T reference, Object errorMessage)  throws IllegalArgumentException {
        if (reference == null) {
          throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
        return reference;
    }

}
