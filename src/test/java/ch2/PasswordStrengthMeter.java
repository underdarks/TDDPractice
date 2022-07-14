package ch2;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String pw) {
        //비밀번호가 비어있꺼나 없을 때
        if(pw == null || pw.isEmpty()) return PasswordStrength.INVALID;

        int metCounts=0;

        if(meetsContainNumber(pw)) metCounts++;         //0~9 사이의 숫자를 포함하는지 체크
        if(meetsContainUpperCase(pw)) metCounts++;      //대문자 포함 여부 확인
        if(pw.length() >= 8) metCounts++;               //길이가 8글자 이상인 경우만 충족(대문자, 0~9 숫자 등 제외)

        if(metCounts == 1) return PasswordStrength.WEAK;
        if(metCounts == 2) return PasswordStrength.NORMAL;

//        if(lengthEnough && !containsNum && !containsUpp)
//            return PasswordStrength.WEAK;
//
//        //숫자 포함 조건만 충족하는 경우
//        if(!lengthEnough && containsNum && !containsUpp)
//            return PasswordStrength.WEAK;
//
//        //대문자 포함 조건만 충족하는 경우
//        if(!lengthEnough && !containsNum && containsUpp)
//            return PasswordStrength.WEAK;

        //길이가 8글자 미만 체크
//        if(!lengthEnough)
//            return PasswordStrength.NORMAL;
//
//        if(!containsNum) return PasswordStrength.NORMAL;
//        if(!containsUpp) return PasswordStrength.NORMAL;


        return PasswordStrength.STRONG;
    }

    private boolean meetsContainUpperCase(String pw) {
        boolean containUpp=false;

        for (char c : pw.toCharArray()) {
            if(Character.isUpperCase(c)){
                containUpp =true;
                break;
            }
        }
        return containUpp;
    }

    private boolean meetsContainNumber(String pw) {
        boolean containsNum=false;

        for (char c : pw.toCharArray()) {
            if(c>='0' && c <= '9'){
                containsNum =true;
                break;
            }
        }

        return containsNum;
    }
}
