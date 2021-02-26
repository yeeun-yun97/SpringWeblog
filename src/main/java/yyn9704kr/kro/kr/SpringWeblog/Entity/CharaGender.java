package yyn9704kr.kro.kr.SpringWeblog.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum CharaGender {
    MALE("남성"), FEMALE("여성");
    private final String desc;

    private CharaGender(String desc) {
        this.desc = desc;
    }
}

