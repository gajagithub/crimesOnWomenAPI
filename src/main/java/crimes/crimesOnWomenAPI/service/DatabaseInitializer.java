package crimes.crimesOnWomenAPI.service;


import crimes.crimesOnWomenAPI.entity.CrimeStatistics;
import crimes.crimesOnWomenAPI.repository.CrimeStatisticsRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class DatabaseInitializer {

    @Autowired
    private CrimeStatisticsRepository repository;

    @PostConstruct
    public void init() {
        System.out.println("Initializing the database with sample data.>>>>>>>>>>>>>>>>>>>..");
        // Populating initial data
        repository.save(new CrimeStatistics(1, "ANDHRA PRADESH", 2001, 871, 765, 420, 3544, 2271, 5791, 7));
        repository.save(new CrimeStatistics(2, "ARUNACHAL PRADESH", 2001, 33, 55, 0, 78, 3, 5,5 ));
    }
}
