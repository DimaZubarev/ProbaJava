package offLine7;

import java.lang.reflect.Field;

public class TestClassA {
    private static final int VAL_X = 10;
    @Precision(param = 5, trailingZeros = 3)
    private double a;
    public  static String print(TestClassA value){
        Class<TestClassA> aClass = TestClassA.class;
        Field field = null;
        try {
            field = aClass.getDeclaredField("a");
            field.setAccessible(true);
            Precision precision = field.getAnnotation(Precision.class);
            return String.format("%." );
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        TestClassA a1 = new TestClassA();
        a1.a = 10;

        Class<TestClassA> aClass = TestClassA.class;
        Field field = aClass.getField("a");
        System.out.println(field);
        Precision precision = field.getAnnotation(Precision.class);
        System.out.println(precision.param() + " : " + precision.trailingZeros());

//        System.out.println(VAL_X);
//        Class<TestClassA> aClass = TestClassA.class;
//        Field field = aClass.getField("VAL_X");
//        System.out.println(field);
//
//        field.setAccessible(true);
//        field.set(null, 20);
//
//        System.out.println(VAL_X);
    }
}
