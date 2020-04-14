package JavaAssignment8;

class InvalidHeightException extends Exception{
    public InvalidHeightException(String message){
        super(message);
    }
}

class BelowExpectedHeightException extends Exception{
    public BelowExpectedHeightException(String message){
        super(message);
    }
}

class HealthIssueException extends Exception {
    public HealthIssueException(String message) {
        super(message);
    }
}
