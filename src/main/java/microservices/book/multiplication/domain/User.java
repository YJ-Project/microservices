package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 사용자 정보를 저장하는 클래스
 */
@RequiredArgsConstructor // final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
@Getter
@ToString
@EqualsAndHashCode // equals, hashCode 자동 생성
public final class User {
    private final String alias;

    //json (역)직렬화를 위한 빈 생성자 -> todo 나중에 확인 필요
    protected User(){
        alias = null;
    }
}
