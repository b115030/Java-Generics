public class PrintMax {
    public boolean printWelcome() {
        System.out.println("Welcome to print max");
        return true;
    }

    //Use Case 1
    public Integer printMaxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maxNumber = firstNumber;
        if (maxNumber.compareTo(secondNumber) < 0)
            maxNumber = secondNumber;
        if (maxNumber.compareTo(thirdNumber) < 0)
            maxNumber = thirdNumber;
        return maxNumber;
    }

    //Use case 2
    public Float printMaxFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maxNumber = firstNumber;
        if (maxNumber.compareTo(secondNumber) < 0)
            maxNumber = secondNumber;
        if (maxNumber.compareTo(thirdNumber) < 0)
            maxNumber = thirdNumber;
        return maxNumber;
    }

    //Use case 3
    public String printMaxString(String firstString, String secondString, String thirdString) {
        String maxString = firstString;
        if (maxString.compareTo(secondString) < 0)
            maxString = secondString;
        if (maxString.compareTo(thirdString) < 0)
            maxString = thirdString;
        return maxString;
    }

}
