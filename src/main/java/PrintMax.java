public class PrintMax<E extends Comparable> {
    E firstObject, secondObject, thirdObject;

    public PrintMax(E firstObject, E secondObject, E thirdObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
    }

    public static boolean printWelcome() {
        System.out.println("Welcome to print max");
        return true;
    }

    public static <E extends Comparable> E testMaximum(E... items) {
        E maxElement = items[0];
        for (E i : items) {
            if (maxElement.compareTo(i) < 0)
                maxElement = i;
        }
        printMax(maxElement, items);
        return maxElement;
    }

    public static <E> void printMax(E maxElement, E... items) {
        System.out.println("For the following elements");
        for (E i : items) {
            System.out.print(i + " ");
        }
        System.out.println("\n Maximum is: " + maxElement);

    }

    public E testMaximum() {
        return testMaximum(this.firstObject, this.secondObject, this.thirdObject);
    }
}
