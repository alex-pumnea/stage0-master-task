package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (checkValidity(firstSide, secondSide, thirdSide) == 1) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    private int checkValidity(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
            return 0;
        } else {
            return 1;
        }
    }

}
