package mum.edu.exception;

public class EmployeeException extends RuntimeException {

    private String id;
    private String message = "Employee Not Found for this email address: ";

    public EmployeeException() {}

    public EmployeeException(String id, String message) {
        this.id = id;

        if(message != null) this.message = message;
    }

    public String getFullMessage() {
        return (message + id);
    }

    public String getEmployeeId() {
        return id;
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

}
