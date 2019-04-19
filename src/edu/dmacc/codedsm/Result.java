package edu.dmacc.codedsm;

public class Result {
    private Submission submission;
    private String message;

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "submission=" + submission +
                ", message='" + message + '\'' +
                '}';
    }
}
