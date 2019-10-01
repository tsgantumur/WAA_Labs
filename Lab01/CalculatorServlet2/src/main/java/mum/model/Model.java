package mum.model;

public class Model {

    private int addedValue;
    private int multipliedValue;

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        addedValue = firstNumber + secondNumber;
    }

    public void multiplyTwoNumbers(int firstNumber, int secondNumber) {

        multipliedValue = firstNumber * secondNumber;
    }

    public int getAddedValue() {

        return addedValue;
    }

    public int getMultipliedValue() {
        return multipliedValue;
    }

}
