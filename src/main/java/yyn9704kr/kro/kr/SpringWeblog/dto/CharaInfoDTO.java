package yyn9704kr.kro.kr.SpringWeblog.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class CharaInfoDTO {

    private int charaId;

    //이름
    private String charaName;
    private String charaNick;

    //테마색
    private String charaColor;

    //기본설정
    private String charaBirthDay;
    private String charaLike;
    private String charaHate;

    //설명
    private String charaDesc;

    //대표전신이미지
    private Byte[] charaStanding;

}
