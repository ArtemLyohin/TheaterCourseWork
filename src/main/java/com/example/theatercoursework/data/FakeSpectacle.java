package com.example.theatercoursework.data;


import com.example.theatercoursework.model.Spectacle;
import com.example.theatercoursework.model.enums.Genre;
import com.example.theatercoursework.model.enums.TargetAudience;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeSpectacle {
    private List<Spectacle> spectacles = new ArrayList<>(Arrays.asList(
            Spectacle.builder()
                     .id(null)
                     .name("Баба Валя")
                     .genre(Genre.COMEDY)
                     .targetAudience(TargetAudience.MIDDLE_AGED)
                     .mainRoles(null)
                     .understudies(null)
                     .secondaryRoles(null)
                     .musicians(null)
                     .director(null)
                     .artist(null)
                     .conductor(null)
                     .author(null)
                     .priceForUsual(150)
                     .description("")
                     .duration(115)
                     .created_at(LocalDateTime.now())
                     .modified_at(LocalDateTime.now())
                     .build(),
            Spectacle.builder()
                     .id(null)
                     .name("Покинутий")
                     .genre(Genre.DRAMA)
                     .targetAudience(TargetAudience.MIDDLE_AGED)
                     .mainRoles(null)
                     .understudies(null)
                     .secondaryRoles(null)
                     .musicians(null)
                     .director(null)
                     .artist(null)
                     .conductor(null)
                     .author(null)
                     .priceForUsual(130)
                     .description("")
                     .duration(130)
                     .created_at(LocalDateTime.now())
                     .modified_at(LocalDateTime.now())
                     .build(),
            Spectacle.builder()
                     .id(null)
                     .name("Олег. Марія. Танці.")
                     .genre(Genre.MUSICAL)
                     .targetAudience(TargetAudience.TEENAGERS)
                     .mainRoles(null)
                     .understudies(null)
                     .secondaryRoles(null)
                     .musicians(null)
                     .director(null)
                     .artist(null)
                     .conductor(null)
                     .author(null)
                     .priceForUsual(100)
                     .description("")
                     .duration(85)
                     .created_at(LocalDateTime.now())
                     .modified_at(LocalDateTime.now())
                     .build(),
            Spectacle.builder()
                     .id(null)
                     .name("Пригода робота Боббі")
                     .genre(Genre.COMEDY)
                     .targetAudience(TargetAudience.CHILDREN)
                     .mainRoles(null)
                     .understudies(null)
                     .secondaryRoles(null)
                     .musicians(null)
                     .director(null)
                     .artist(null)
                     .conductor(null)
                     .author(null)
                     .priceForUsual(100)
                     .description("")
                     .duration(65)
                     .created_at(LocalDateTime.now())
                     .modified_at(LocalDateTime.now())
                     .build(),
            Spectacle.builder()
                     .id(null)
                     .name("Відчайдушна київлянка")
                     .genre(Genre.OPERETTA)
                     .targetAudience(TargetAudience.ELDERLY)
                     .mainRoles(null)
                     .understudies(null)
                     .secondaryRoles(null)
                     .musicians(null)
                     .director(null)
                     .artist(null)
                     .conductor(null)
                     .author(null)
                     .priceForUsual(140)
                     .duration(90)
                     .description("")
                     .created_at(LocalDateTime.now())
                     .modified_at(LocalDateTime.now())
                     .build()
                                                                       ));

    public List<Spectacle> getSpectacles() {
        return spectacles;
    }

    public void setSpectacles(List<Spectacle> specttacles) {
        this.spectacles = specttacles;
    }
}
