package io.getarrays.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "people")
public class AppUser {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;

    @ManyToMany(fetch = EAGER)
    private Collection<Role> roles = new ArrayList<>();
}
