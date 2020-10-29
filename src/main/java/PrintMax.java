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

    public static <E extends Comparable> E testMaximum(E firstElement, E secondElement, E thirdElement) {
        E maxElement = firstElement;
        if (maxElement.compareTo(secondElement) < 0)
            maxElement = secondElement;
        if (maxElement.compareTo(thirdElement) < 0)
            maxElement = thirdElement;
        return maxElement;
    }

    public E testMaximum() {
        return testMaximum(this.firstObject, this.secondObject, this.thirdObject);
    }
}
