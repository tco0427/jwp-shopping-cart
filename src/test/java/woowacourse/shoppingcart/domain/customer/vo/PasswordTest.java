package woowacourse.shoppingcart.domain.customer.vo;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PasswordTest {

    @DisplayName("비밀번호는 형식을 지켜야한다.")
    @Test
    public void checkPassword() {
        assertThatThrownBy(() -> Password.from("pwd1!"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("비밀번호는 형식을 지키면 제대로 생성된다.")
    @Test
    public void createPassword() {
        assertDoesNotThrow(() -> Password.from("password1!"));
    }
}
