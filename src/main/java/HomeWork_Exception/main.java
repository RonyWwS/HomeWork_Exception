package HomeWork_Exception;

public class main {

    public static void main(String[] args) {

        String[][] stringArray = new String[][] {{"1","2","3","4"}, {"word","word","word","word"}, {"5","6","7","8"},{"word","word","word","word"}};

        try {
            stringArrayException(stringArray);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    private static void stringArrayException (String[][] stringArray) throws MyArraySizeException {
        if (stringArray.length != 4) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < stringArray.length; i++) {
                for (int j = 0; j < stringArray.length; j++) {
                    System.out.println(stringArray);
                }
            }
        }
    }
}
