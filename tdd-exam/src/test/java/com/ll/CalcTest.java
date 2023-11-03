package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CalcTest {

    @Test
    @DisplayName("Calc의 run 메서드는 int를 리턴한다.")
    void t1() {
        int rs = Calc.run("10 + 20");

    }


    @Test
    @DisplayName("10 + 10 = 20")
    void t2() {
        int rs = Calc.run("10 + 10");
        assertThat(rs).isEqualTo(20);  // rs가 20이랑 똑같아야한다는 단정문
    }

    @Test
    @DisplayName("10 + 20 = 20")
    void t3() {
        int rs = Calc.run("10 + 20");
        assertThat(rs).isEqualTo(30);  // rs가 20이랑 똑같아야한다는 단정문
    }




    @Test
    @DisplayName("10 - 10 = 20")
    void t4() {
        int rs = Calc.run("10 - 10");
        assertThat(rs).isEqualTo(0);  // rs가 20이랑 똑같아야한다는 단정문
    }

    @Test
    @DisplayName("10 - 5 = 5")
    void t5() {
        int rs = Calc.run("10 - 5");
        assertThat(rs).isEqualTo(5);
    }

}
