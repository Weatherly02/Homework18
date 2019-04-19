package edu.dmacc.codedsm;

public class FizzBuzzServiceImpl implements FizzBuzzService {
    @Override
    public Result performFizzBuzzLogic(Submission submission) {
        String message = "";
        if (submission.getInputNumber() % 3 == 0 && submission.getInputNumber() % 5 == 0) {
            message = "FizzBuzz!";
        } else if (submission.getInputNumber() % 3 == 0) {
            message = "Fizz";
        } else if (submission.getInputNumber() % 5 == 0) {
            message = "Buzz";
        } else {
            message = "Input was not fizzy";
        }


        Result result = new Result();
        result.setMessage(message);
        result.setSubmission(submission);
        return result;
    }
}


