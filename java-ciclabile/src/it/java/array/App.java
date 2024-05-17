package it.java.array;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n *******************  JAVA ARRAY COLLECTION  ******************** \n");

        int[] arrayElements = { 1, 2, 3, 4, 5 };

        ArrayList array = new ArrayList(arrayElements);

        array.addElement(30);
        array.addElement(40);

        while (array.hasElements()) {

            int index = array.getCurrentIndex();

            // array.getNextElement();

            System.out.print("indice : " + index + " Elemento :  " + array.getNextElement() + ", \n");

            index++;

        }
    }
}
