package crimes.crimesOnWomenAPI.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CrimeStatistics {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates the primary key
        private Integer id;      // Auto-generated primary key
        private String state;
        private Integer crimeYear;
        private Integer rape;
        private Integer ka;       // K&A
        private Integer dd;       // DD
        private Integer aow;      // AoW
        private Integer aom;      // AoM
        private Integer dv;       // DV
        private Integer wt;       // WT



    // Getters and Setters
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getCrimeYear() {
            return crimeYear;
        }

        public void setCrimeYear(Integer crimeYear) {
            this.crimeYear = crimeYear;
        }

        public Integer getRape() {
            return rape;
        }

        public void setRape(Integer rape) {
            this.rape = rape;
        }

        public Integer getKa() {
            return ka;
        }

        public void setKa(Integer ka) {
            this.ka = ka;
        }

        public Integer getDd() {
            return dd;
        }

        public void setDd(Integer dd) {
            this.dd = dd;
        }

        public Integer getAow() {
            return aow;
        }

        public void setAow(Integer aow) {
            this.aow = aow;
        }

        public Integer getAom() {
            return aom;
        }

        public void setAom(Integer aom) {
            this.aom = aom;
        }

        public Integer getDv() {
            return dv;
        }

        public void setDv(Integer dv) {
            this.dv = dv;
        }

        public Integer getWt() {
            return wt;
        }

        public void setWt(Integer wt) {
            this.wt = wt;
        }

    public CrimeStatistics( String state, int crimeYear, int rape, int ka, int dd, int aow, int aom, int dv, int wt) {
            this.state = state;
            this.crimeYear = crimeYear;
            this.rape = rape;
            this.ka = ka;
            this.dd = dd;
            this.aow = aow;
            this.aom = aom;
            this.dv = dv;
            this.wt = wt;
    }
    public CrimeStatistics(){}

    }

