package persons;

public class Passport  {
    private String passSR;
    private String passNum;

    public Passport() {
    };

    public Passport(String passSR,String passNum) {
        if (CheackPassParams (passSR,passNum)){
            this.passSR = passSR;
            this.passNum = passNum;
        }
        else  throw new IllegalArgumentException("Series / Number passport cannot are incorrect.");
    };
    private boolean CheackPassParams(String passSR,String passNum){
        if (passSR.matches("[А-Я]{2}")&&passNum.matches("\\d{6}"))
            return true ;
        else return false;
    }
    public String print() {
        return "Passport information: series: " + this.passSR + ", number: " + this.passNum;
    }
    public  String getSeriesPassport() {
        return passSR;
    }

    public  String getNumberPassport() {
        return passNum;
    }

    public  void setSeriesPassport(String passSR) {

        if ((passSR==null)||!passSR.matches("[А-Я]{2}")) {
            throw new IllegalArgumentException("Series passport cannot be null or has to beCyrillic symbols");
        }
        this.passSR = passSR;
    }

    public  void setNumberPassport(String  passNum) {
        if (passNum==null||! passNum.matches("\\d{6}")) {
            throw new IllegalArgumentException("Number passport cannot be empty or zero or less  than 6 figure ");
        }
        this.passNum = passNum;
    }

}
