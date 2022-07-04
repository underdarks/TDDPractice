package ch2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordStrengthMeterTest {


    private final PasswordStrengthMeter meter=new PasswordStrengthMeter();
    /**
     * 검사 규칙
     * 1. 길이가 8글자 이상
     * 2. 0부터 9사이의 숫자를 포함
     * 3. 대문자 포함
     */



    @DisplayName("모든 조건을 충족하는 암호. 암호 강도는 강함")
    @Test
    public void meetsAllCriteriaThenStrong() {
        //given

        //when

        //then
        assertStrength(PasswordStrength.STRONG,"ab12!@AB");
        assertStrength(PasswordStrength.STRONG,"abc1!Add");
    }

    @DisplayName("패스워드 길이가 8글자 미만이고 나머지 종건은 충족하는 암호. 암호 강도는 보통")
    @Test
    public void meetsOtherCriteria_except_for_Length_Then_Normal(){
        //given

        //when
        assertStrength(PasswordStrength.NORMAL, "ab12!@A");
    }

    @DisplayName("숫자를 포함하지 않고 나머지 조건을 만족하는 암호. 암호 강도는 보통")
    @Test
    public void meetsOtherCriteria_except_for_number_Then_Normal(){
        //given

        //when
        assertStrength(PasswordStrength.NORMAL, "ab!@ABqwer");
    }

    private void assertStrength(PasswordStrength excepted, String pw) {
        PasswordStrength actual = meter.meter(pw);

        //then
        assertEquals(excepted,actual);
    }


}
