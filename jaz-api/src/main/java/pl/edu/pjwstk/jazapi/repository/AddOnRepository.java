package pl.edu.pjwstk.jazapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjwstk.jazapi.model.AddOn;

import java.util.List;

@Repository
public interface AddOnRepository extends JpaRepository<AddOn, Long> {

}
