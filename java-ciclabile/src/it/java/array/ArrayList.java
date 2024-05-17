package it.java.array;

public class ArrayList {

    private int[] intArray;
    private int currentIndex;

    public int[] getIntArray() {
        return intArray;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    // costruttore

    public ArrayList(int[] intArray) {

        this.intArray = intArray;
        this.currentIndex = 0;
    }

    // metodi

    public boolean hasElements() {
        return currentIndex < intArray.length;
    }

    public int getNextElement() {
        if (hasElements()) {
        }
        // System.out.println(intArray[currentIndex]);
        // currentIndex++;

        return intArray[currentIndex++];
    }

}
