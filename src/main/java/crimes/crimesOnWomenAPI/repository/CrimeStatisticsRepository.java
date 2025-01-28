package crimes.crimesOnWomenAPI.repository;
import crimes.crimesOnWomenAPI.entity.CrimeStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CrimeStatisticsRepository extends JpaRepository<CrimeStatistics, Integer> {
    List<CrimeStatistics> findByState(String state);
    List<CrimeStatistics> findByCrimeYear(Integer crimeYear);
}

