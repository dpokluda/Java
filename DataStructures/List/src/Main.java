public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>(new Integer[]{1, 2, 3, 4});

        list.pushBack(5);
        list.pushBack(10);
        list.pushBack(15);

        System.out.println("List size: " + list.getSize());
        for (int i = 0; i < list.getSize(); ++i) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.popBack();
        list.pushBack(20);

        System.out.println("Modified list: ");
        for (int i = 0; i < list.getSize(); ++i) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}