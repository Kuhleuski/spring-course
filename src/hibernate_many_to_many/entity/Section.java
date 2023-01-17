package hibernate_many_to_many.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
@NoArgsConstructor
@Getter
@Setter

public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.PERSIST,
            CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "child_section",
            joinColumns = @JoinColumn(name = "section_id"),
            inverseJoinColumns = @JoinColumn(name = "child_id ")
    )
    private List<Child> childrenList;

    public Section(String name) {
        this.name = name;
    }

    public void addChildToSection(Child child){
        if (childrenList==null){
            childrenList = new ArrayList<>();
        }
        childrenList.add(child);
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
