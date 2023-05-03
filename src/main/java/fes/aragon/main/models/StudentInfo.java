package fes.aragon.main.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentInfo {
    private String name;
    private String teacherName;
    private String subject;
    private Integer group;
}
