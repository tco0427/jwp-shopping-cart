package woowacourse.shoppingcart.domain.customer;

import woowacourse.shoppingcart.domain.customer.vo.Email;
import woowacourse.shoppingcart.domain.customer.vo.Password;
import woowacourse.shoppingcart.domain.customer.vo.Username;

public class Customer {

    private final Long id;
    private final Email email;
    private final Password password;
    private final Username username;

    public Customer(String email, String password, String username) {
        this(null, email, password, username);
    }

    public Customer(Long id, String email, String password, String username) {
        this.id = id;
        this.email = Email.from(email);
        this.password = Password.from(password);
        this.username = Username.from(username);
    }

    public void checkPassword(String password) {
        this.password.checkPassword(password);
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email.getEmail();
    }

    public String getPassword() {
        return password.getPassword();
    }

    public String getUsername() {
        return username.getUsername();
    }
}
