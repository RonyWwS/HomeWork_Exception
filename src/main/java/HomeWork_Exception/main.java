package HomeWork_Exception;

public class main {

    public static void main(String[] args) {

        String[][] stringArray = new String[][] {{"1","2","3","4"}, {"word","word","word","word"}, {"5","6","7","8"},{"word","word","word","word"}};

        try {
            try {
                int result = stringArrayException(stringArray);
                System.out.println("Result = " + result);
            } catch (MyArraySizeException e) {
                System.out.println("Array size > 4");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Wrong data array");
            System.out.println("Coordinate error: y " + e.i + " x " + e.j);
        }
    }

    private static int stringArrayException (String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if(stringArray.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    count = count + Integer.parseInt(stringArray[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
