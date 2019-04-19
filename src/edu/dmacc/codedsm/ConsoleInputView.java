package edu.dmacc.codedsm;

public class ConsoleInputView {
    private Result result;

    public ConsoleInputView(Result result) {
        this.result = result;
    }

    public void render () {
        System.out.println("result = " + result);

    }
}
