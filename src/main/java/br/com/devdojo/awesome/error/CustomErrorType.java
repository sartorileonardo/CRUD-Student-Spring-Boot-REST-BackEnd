package br.com.devdojo.awesome.error;

/**
 * Created by Leonardo Sartori on 26/12/2018.
 */
public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
