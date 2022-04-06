package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * {@link User}가 {@link Multiplication}을 계산한 답안을 정의한 클래스
 */
@RequiredArgsConstructor // final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
@Getter
@ToString
@EqualsAndHashCode // equals, hashCode 자동 생성
public final class MultiplicationResultAttempt {
    private final User user;
    private final Multiplication multiplication;
    private final int resultAttempt;

    MultiplicationResultAttempt(){
        user = null;
        multiplication = null;
        resultAttempt = -1;
    }
}
