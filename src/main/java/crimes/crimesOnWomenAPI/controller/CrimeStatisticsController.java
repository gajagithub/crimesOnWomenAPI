package crimes.crimesOnWomenAPI.controller;

import crimes.crimesOnWomenAPI.entity.CrimeStatistics;
import crimes.crimesOnWomenAPI.service.CrimeStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crime-statistics")
public class CrimeStatisticsController {

    @Autowired
    private CrimeStatisticsService service;

    // Get all statistics
    @GetMapping("/")
    public List<CrimeStatistics> getAllStatistics() {
        return service.getAllStatistics();
    }

    // Get statistics by state
    @GetMapping("/state/{state}")
    public List<CrimeStatistics> getStatisticsByState(@PathVariable String state) {
        return service.getStatisticsByState(state);
    }

    // Get statistics by year
    @GetMapping("/year/{year}")
    public List<CrimeStatistics> getStatisticsByYear(@PathVariable Integer year) {
        return service.getStatisticsByYear(year);
    }

}
