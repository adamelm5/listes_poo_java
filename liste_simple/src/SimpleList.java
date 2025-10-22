public class SimpleList {
    private int capacity;
    private int lenght;
    private int[] elements;

    public SimpleList(int capacity) {
        this.capacity = capacity;
        this.lenght = 0;
        this.elements = new int[capacity];
    }

    public int getLenght() {
        return lenght;
    }

    public int getCapacity() {
        return capacity;
    }

    public void append(int a) {
        if (lenght == capacity) {
            // exception non vérifiée
            throw new RuntimeException("List is full"); 
        }
        elements[lenght] = a;
        lenght++;
    }

    public void remove(int index) {
        if (index < 0 || index >= lenght) {
            throw new RuntimeException("Index out of range");
        }
        // on déplace les éléments à gauche après l'élément à supprimer
        for (int i = index; i < lenght - 1; i++) {
            elements[i] = elements[i + 1];
        }
        lenght--;
    }

    public String ToString() {
        String s = "[ ";
        for (int i = 0; i < lenght; i ++) {
            s += elements[i] + " ";
            if (i < lenght - 1) {
                s += ", ";
            }
        }
        return s + "]";
    }
}