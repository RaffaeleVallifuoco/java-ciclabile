package it.java.array;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n *******************  JAVA ARRAY COLLECTION  ******************** \n");

        int[] arrayElements = { 1, 2, 3, 4, 5 };

        ArrayList array = new ArrayList(arrayElements);

        while (array.hasElements()) {
            System.out.print(array.getNextElement() + ", \n");
        }
    }
}
