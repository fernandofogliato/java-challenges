package br.com.fogliato;

import java.util.Objects;

public class JoinNumbers {
    private static final Integer MAX_VALUE_ALLOWED = 1000000;

    public static Integer joinNumbers(Integer firstNumber, Integer secondNumber) {
        if (Objects.isNull(firstNumber) || Objects.isNull(secondNumber)) {
            throw new IllegalArgumentException("The numbers must not be null");
        }

        StringBuilder finalNumber = new StringBuilder();
        String strFirstNumber = firstNumber.toString();
        String strSecondNumber = secondNumber.toString();

        do {
            finalNumber.append(strFirstNumber, 0, 1);
            finalNumber.append(strSecondNumber, 0, 1);

            strFirstNumber = strFirstNumber.substring(1);
            strSecondNumber = strSecondNumber.substring(1);

        } while (strFirstNumber.length() > 0 && strSecondNumber.length() > 0);

        if (strFirstNumber.length() > 0) {
            finalNumber.append(strFirstNumber);
        } else if (strSecondNumber.length() > 0) {
            finalNumber.append(strSecondNumber);
        }

        Integer mixedNumber = Integer.valueOf(finalNumber.toString());
        return mixedNumber > MAX_VALUE_ALLOWED ? -1 : mixedNumber;
    }
}