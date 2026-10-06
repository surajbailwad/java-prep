package main.dsa.loops;

import static java.lang.Math.min;

public class Patterns {
    private Patterns() {
    }

    public static void run(){
        Patterns.printMatrix(6, 6);
        Patterns.squareMatrix(4, 3);
        Patterns.leftPyramidAsterix(4, 4);
        Patterns.leftPyramidNum(4, 4);
        Patterns.leftPyramidRows(4, 4);
        Patterns.leftInvertedPyramidAsterix(4, 5);
        Patterns.leftInvertedPyramidNum(5);
        Patterns.uprightPyramid(5);
        Patterns.invertedPyramid(5);
        Patterns.diamond(5);
        Patterns.sidePyramid(5);
        Patterns.leftBinaryPyramid(5);
        Patterns.invertedSpacePyramid(5);
        Patterns.serialLeftNumPyramid(5);
        Patterns.alphaLeftPyramid(5);
        Patterns.alphaInvertedLeftPyramid(5);
        Patterns.alphaDuplicateLeftPyramid(5);
        Patterns.uprightAlphabetPyramid(5);
        Patterns.leftReverseAlphabetPyramid(5);
        Patterns.hollowDiamond(5);
        Patterns.invertedDiamond(5);
        Patterns.hollowSquare(5);
        Patterns.numericalSquare(4);
    }


    public static void printMatrix(int columns, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(i + "," + j + "\t");
            }
        }
        System.out.println();
    }

    public static void squareMatrix(int columns, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public static void leftPyramidAsterix(int columns, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            for (int j = 0; j < columns; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }

    public static void leftPyramidNum(int columns, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            for (int j = 0; j < columns; j++) {
                if (i >= j) {
                    System.out.print(j + 1);
                }
            }
        }
        System.out.println();
    }

    public static void leftPyramidRows(int columns, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            for (int j = 0; j < columns; j++) {
                if (i >= j) {
                    System.out.print(i + 1);
                }
            }
        }
        System.out.println();
    }

    public static void leftInvertedPyramidAsterix(int columns, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            for (int j = 0; j < columns; j++) {
                if (i <= j) {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }

    public static void leftInvertedPyramidNum(int columns) {
        for (int i = 0; i < columns; i++) {
            for (int j = 1; j <= columns - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void uprightPyramid(int columns) {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < columns - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void invertedPyramid(int columns) {
        for (int i = columns; i > 0; i--) {
            for (int j = 0; j < columns - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < columns - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void diamond(int columns) {
        uprightPyramid(columns);
        invertedPyramid(columns);
        System.out.println();
    }

    public static void sidePyramid(int columns) {
        for (int i = 1; i <= 2 * columns - 1; i++) {
            int stars = i;
            if (i > columns) {
                stars = 2 * columns - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void leftBinaryPyramid(int columns) {
        int binary = 1;
        for (int i = 1; i <= columns; i++) {
            binary = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(binary);
                binary = 1 - binary;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void invertedSpacePyramid(int columns) {
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= columns * 2; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else if (i + j > columns * 2) {
                    System.out.print(columns * 2 - j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void serialLeftNumPyramid(int columns) {
        int leftNum = 1;
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(leftNum + " ");
                leftNum++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void alphaLeftPyramid(int columns) {
        for (int i = 1; i <= columns; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void alphaInvertedLeftPyramid(int columns) {
        for (int i = columns; i >= 0; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void alphaDuplicateLeftPyramid(int columns) {
        for (int i = 0; i <= columns; i++) {
            char character = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void uprightAlphabetPyramid(int columns) {
        for (int i = 0; i < columns; i++) {
            char character = 'A';
            for (int j = 0; j < columns - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(character);
                if (j <= (2 * i + 1) / 2) {
                    character++;
                } else {
                    character--;
                }
            }
            for (int j = 0; j < columns - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void leftReverseAlphabetPyramid(int columns) {
        for (int i = 0; i < columns; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hollowDiamond(int columns) {
        for (int i = 0; i < columns; i++) {
            for (int j = 1; j <= columns - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= columns - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= columns; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < columns * 2 - i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void invertedDiamond(int columns) {
        int spaces = 2 * columns - 2;
        for (int i = 1; i <= 2 * columns - 1; i++) {
            int stars = i;
            if (i > columns) {
                stars = 2 * columns - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < columns) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
        System.out.println();
    }

    public static void hollowSquare(int columns) {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == 0 || i == 0 || i == columns - 1 || j == columns - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void numericalSquare(int columns) {
        for (int i = 0; i < 2 * columns - 1; i++) {
            for (int j = 0; j < 2 * columns - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * columns - 2) - j;
                int down = (2 * columns - 2) - i;
                System.out.print((columns - min(min(top, down), min(left, right))));
            }
            System.out.println();
        }
    }
}
