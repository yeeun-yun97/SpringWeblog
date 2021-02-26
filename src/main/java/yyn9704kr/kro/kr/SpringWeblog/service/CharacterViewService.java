package yyn9704kr.kro.kr.SpringWeblog.service;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import yyn9704kr.kro.kr.SpringWeblog.Entity.Character;
import yyn9704kr.kro.kr.SpringWeblog.dto.CharaInfoDTO;
import yyn9704kr.kro.kr.SpringWeblog.repository.CharacterRepository;

import java.util.*;

@AllArgsConstructor
@Service
public class CharacterViewService {
    private CharacterRepository characterRepository;


    public ResponseEntity<CharaInfoDTO> getCharaInfo(int charaId) throws Exception {
        Optional<Character> opt = characterRepository.findById(charaId);
        if (opt.isPresent()) {
            Character character = opt.get();
            return ResponseEntity.ok(CharaInfoDTO.builder()
                    .charaId(character.getCharaId())
                    .charaName(character.getCharaName())
                    .charaNick(character.getCharaNick())
                    .charaColor(character.getCharaColor())
                    .charaBirthDay(character.getCharaBirthday())
                    .charaLike(character.getCharaLike())
                    .charaHate(character.getCharaHate())
                    .charaDesc(character.getCharaDesc())
                    .build());
        } else {
            throw new Exception("아이디 " + charaId + "에 해당하는 정보가 없습니다.");
        }
    }

    public List<CharaInfoDTO> getCharaListByTags(List<Integer> charaTagIds) {
        return new ArrayList<CharaInfoDTO>();
    }
}


