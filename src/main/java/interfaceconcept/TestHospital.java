package interfaceconcept;

public class TestHospital {

    public static void main(String[] args) {

        FortisHospital fortisHospital = getFortisHospital();

        fortisHospital.emergencyServices(); //common Method across all 3 interface

        //Top casting
        USMedical usMedical = new FortisHospital();
        usMedical.dentalServices();
        usMedical.oncologyServices();
        usMedical.physioServices();
        usMedical.emergencyServices();
        USMedical.billing(); //Using class name we can call the static method
        System.out.println(USMedical.MIN_FEE); //100
        System.out.println(FortisHospital.MIN_FEE); //50
        usMedical.covidVaccination();

        UKMedical ukMedical = new FortisHospital();
        ukMedical.dermaServices();
        ukMedical.emergencyServices();
        ukMedical.entServices();
        ukMedical.pediaServices();

        IndiaMedical indiaMedical = new FortisHospital();
        indiaMedical.cardioServices();
        indiaMedical.nuroServices();
        indiaMedical.emergencyServices();
        indiaMedical.orthoServices();


    }

    private static FortisHospital getFortisHospital() {
        FortisHospital fortisHospital = new FortisHospital();
        fortisHospital.cardioServices();
        fortisHospital.dentalServices();
        fortisHospital.nuroServices();
        fortisHospital.entServices();
        fortisHospital.pediaServices();
        fortisHospital.dermaServices();
        fortisHospital.physioServices();
        fortisHospital.physioServices();
        fortisHospital.oncologyServices();
        fortisHospital.medicalInsurance(); // Inherited method
        fortisHospital.covidVaccination();

        //Indivudial methods
        fortisHospital.medicalTraining();
        fortisHospital.pathologyServices();

        fortisHospital.medicalNews();
        fortisHospital.medicalRD();
        return fortisHospital;
    }
}
