package yyn9704kr.kro.kr.SpringWeblog.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum CharaType {
    original("오리지널"), girls_frontline("소녀전선"), lovelive("러브라이브");

    private final String desc;

    private CharaType(String desc) {
        this.desc = desc;
    }
}
