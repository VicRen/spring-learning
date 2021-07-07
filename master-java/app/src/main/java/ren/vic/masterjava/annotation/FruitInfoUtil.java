package ren.vic.masterjava.annotation;

import java.lang.reflect.Field;

public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitProvider = "Provider: ";
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = (FruitProvider)field.getAnnotation(FruitProvider.class);
                strFruitProvider = "provider id: " + fruitProvider.id()
                        + " name: " + fruitProvider.name()
                        + " address: " + fruitProvider.address();
            }
        }
        System.out.println(strFruitProvider);
    }
}
