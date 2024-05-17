package it.java.array;

public class ArrayList {

    private int[] intArray;
    private int index;

    // costruttore

    public int[] getIntArray() {
        return intArray;
    }

    public int getIndex() {
        return index;
    }

    public ArrayList(int[] intArray) {

        this.intArray = intArray;
        this.index = 0;
    }

    // metodi

    public boolean hasElements() {
        return index < intArray.length;
    }

    public int getNextElement() {
        if (hasElements()) {
        }

        return intArray[index++];
    }

}
