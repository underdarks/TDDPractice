package ch2;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String pw) {
        //길이가 8글자 미만 체크
        if(pw.length() < 8 )
            return PasswordStrength.NORMAL;

        //0~9 사이의 숫자를 포함하는지 체크
        boolean containsNum=false;
        containsNum = meetsContainNumber(pw, containsNum);

        if(!containsNum) return PasswordStrength.NORMAL;
        return PasswordStrength.STRONG;
    }

    private boolean meetsContainNumber(String pw, boolean containsNum) {
        for (char c : pw.toCharArray()) {
            if(c>='0' && c <= '9'){
                containsNum =true;
                break;
            }
        }
        return containsNum;
    }
}
