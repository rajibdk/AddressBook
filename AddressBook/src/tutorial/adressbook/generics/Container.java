package tutorial.adressbook.generics;

import java.util.ArrayList;
import java.util.List;

public class Container <T> {
    private Object[] objects = new Object[20];
    private int index = 0;

    public void addElement(T element) {
        objects[index++] = element;
        for (Object ele : objects) {
            if(ele != null) {
                System.out.println(ele);
            }
        }
    }

    public static void main(String[] args) {
        Container<String> container = new Container();
        container.addElement("someString");
        container.addElement("anotherString");
        container.addElement("oneMoreString");

        List<String> list = new ArrayList();
        list.add("someString");
        list.add("anotherString");
        list.add("oneMoreString");

        System.out.println(list);
    }
}
