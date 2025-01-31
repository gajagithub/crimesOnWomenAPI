package crimes.crimesOnWomenAPI.service;

import crimes.crimesOnWomenAPI.entity.CrimeStatistics;
import crimes.crimesOnWomenAPI.repository.CrimeStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrimeStatisticsService {

    @Autowired
    private CrimeStatisticsRepository repository;

    public List<CrimeStatistics> getAllStatistics() {
        return repository.findAll();
    }

    public List<CrimeStatistics> getStatisticsByState(String state) {
        return repository.findByStateOrderByCrimeYearDesc(state);
    }

//    public List<CrimeStatistics> getStatisticsByYear(Integer crimeYear) {
//        return repository.findByCrimeYear(crimeYear);
//    }

}
