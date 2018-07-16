public class Main {

    public static void main(String[] args) {
        System.out.println();

        int numberOfLines = 14;
        int emptySpace = 21;
        int numberOfStarsInLineInLine = 1;
        int spaceBetweenStarLegs = 1;

        for (int lines = 0; lines <= numberOfLines; lines++) {
            if (lines <= 5) {
                for (int space = 0; space <= emptySpace; space++)
                    System.out.print(" ");
                emptySpace--;
                for (int stars = 1; stars <= numberOfStarsInLineInLine; stars++)
                    System.out.print("*");
                System.out.println();
                numberOfStarsInLineInLine += 2;
            } else if (lines <= 9 && lines > 6) {
                for (int space = 0; space <= emptySpace - 5; space++)
                    System.out.print(" ");
                emptySpace++;
                for (int stars = 1; stars <= numberOfStarsInLineInLine + 10; stars++)
                    System.out.print("*");
                System.out.println();
                numberOfStarsInLineInLine -= 2;
            } else if (lines > 9 && lines < 12) {
                for (int space = 0; space <= emptySpace - 5; space++)
                    System.out.print(" ");
                emptySpace--;
                for (int stars = 1; stars <= numberOfStarsInLineInLine + 10; stars++)
                    System.out.print("*");
                System.out.println();
                numberOfStarsInLineInLine += 2;
            } else if (lines > 11 && lines <= 13) {
                for (int space = 0; space <= emptySpace - 6; space++)
                    System.out.print(" ");
                emptySpace--;
                for (int stars = 1; stars < numberOfStarsInLineInLine; stars++)
                    System.out.print("*");
                for (int space = 2; space <= spaceBetweenStarLegs + 3; space++)
                    System.out.print(" ");
                spaceBetweenStarLegs += 6;
                for (int stars = 1; stars < numberOfStarsInLineInLine; stars++)
                    System.out.print("*");
                System.out.println();
                numberOfStarsInLineInLine -= 2;
            }
        }
    }
}
