public class PrintMax {
    public boolean printWelcome() {
        System.out.println("Welcome to print max");
        return true;
    }
    public <E extends Comparable> E printMaxElement(E firstElement, E secondElement, E thirdElement){
        E maxElement= firstElement;
        if (maxElement.compareTo(secondElement)<0)
            maxElement=secondElement;
        if (maxElement.compareTo(thirdElement)<0)
            maxElement=thirdElement;
        return maxElement;
    }
}
