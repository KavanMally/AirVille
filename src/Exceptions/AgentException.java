package Exceptions;

/**
 * Created by kavan on 12/3/15.
 */
public class AgentException extends Exception {


    private ErrorCode errorCode;

    public enum ErrorCode{

        SUPERVISOR_NOT_AVAILABLE,
        SUPERVISOR_REQUIRED_FOR_OPERATION
        ;
    }


    public AgentException(ErrorCode errorCode){
        this.errorCode = errorCode;
    }



}
