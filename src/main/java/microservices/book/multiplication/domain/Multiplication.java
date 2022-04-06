package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 애플리케이션에서 곱셈을 나타내는 클래스(a*b)
 */
@RequiredArgsConstructor // final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
@Getter
@ToString
@EqualsAndHashCode // equals, hashCode 자동 생성
public final class Multiplication {
    private final int factorA;
    private final int factorB;

    Multiplication(){
        this(0,0);
    }
}
