package basics.aad.arraylist;

import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Field;

class ArrayListIntro {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        System.out.println(names.size());
        System.out.println(ArrayListHelper.getArrayListCapacity(names));
    }

}

class ArrayListHelper {

    static final Field field;
    static {
        try {
            field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static int getArrayListCapacity(List<String> arrayList) {
        try {
            final String[] elementData = (List<String>) field.get(arrayList);
            return elementData.length;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
