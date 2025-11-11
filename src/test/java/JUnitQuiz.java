import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat; // ★ 이게 핵심


public class JUnitQuiz {


    /*public void junitTest() {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        // ① 모든 변수가 null이 아닌지 확인
        // ② name1과 name2가 같은지 확인
        // ③ name1과 name3이 다른지 확인
    }

    @Test //JUnitQuiz.java
    public void junitQuiz1() {

        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        // ① 모든 변수가 null이 아닌지 확인
        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        // ② name1과 name2가 같은지 확인
        assertThat(name1).isEqualTo(name2);

        // ③ name1과 name3이 다른지 확인
        assertThat(name1).isNotEqualTo(name3);
    }*/
    /*@Test
    public void junitTest2() {
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

    }
    @Test
    public void junitQuiz2() {
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;


        assertThat(number1).isPositive();

        assertThat(number2).isZero();

        assertThat(number3).isNegative();

        assertThat(number1).isGreaterThan(number2);

        assertThat(number3).isLessThan(number2);
    }*/
}
