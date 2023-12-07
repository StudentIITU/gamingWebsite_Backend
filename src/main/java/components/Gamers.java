package components;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Gamers {
    private Integer id;
    private String name;
    private String email;
    private String password;


    public Gamers() {
        super();
    }

    public Gamers(Integer id, String name, String email, String password) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
