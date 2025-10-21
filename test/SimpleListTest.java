public class SimpleListTest {

    public static void main(String[] args) {
        SimpleList list = new SimpleList(5);
        System.out.println("We created an empty list of capacity 5.");
        System.out.println("current list is : " + list.ToString());
        System.out.println("lenght is : " + list.getLenght());
        System.out.println("capacity is : " + list.getCapacity());
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        System.out.println("\nWe added 5 elements that are 1, 2, 3, 4 and 5.");
        System.out.println("current list is : " + list.ToString());
        System.out.println("lenght is : " + list.getLenght());
        System.out.println("capacity is : " + list.getCapacity());
        list.remove(2);
        System.out.println("\nWe removed the element at index 2.");
        System.out.println("current list is : " + list.ToString());
        System.out.println("lenght is : " + list.getLenght());
        System.out.println("capacity is : " + list.getCapacity());
    }
}