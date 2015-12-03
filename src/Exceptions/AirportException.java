package Exceptions;

/**
 * Created by kavan on 12/2/15.
 */
public class AirportException extends Exception {



    private ErrorCode errorCode;

    public enum ErrorCode{

        TOO_MANY_SUPERVISORS,
        INSUFFICIENT_FUNDS
        ;
    }


    public AirportException(ErrorCode errorCode){

        this.errorCode = errorCode;

    }




}
