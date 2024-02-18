import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        StaticExercise s1 = new StaticExercise();
        StaticExercise s2 = new StaticExercise();
        s1.name = "Lee";
        System.out.println("s1 name = " + s1.name);
        System.out.println("s2 name = " + s2.name);
        System.out.println(System.identityHashCode(s1.name));
        System.out.println(System.identityHashCode(s2.name));

        NotstaticExercise s3 =  new NotstaticExercise();
        NotstaticExercise s4 = new NotstaticExercise();

        s3.name = "Choi";
        System.out.println("s3 name = " + s3.name);
        System.out.println("s4 name = "  + s4.name);
        System.out.println(System.identityHashCode(s3.name));
        System.out.println(System.identityHashCode(s4.name));
        printmain();  // 유틸리티성 사용 객체 생성없이 메서드 사용 static 메서드가 됨
    }
     static void printmain(){
        System.out.println(11);
    }
}
