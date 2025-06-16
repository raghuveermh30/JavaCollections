package interfaceconcept;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndiaMedical {

    static final int MIN_FEE = 50;

    //IndiaMedical
    @Override
    public void cardioServices() {
        System.out.println("Fortis -- cardioServices");
    }


    @Override
    public void orthoServices() {
        System.out.println("Fortis -- orthoServices");
    }


    @Override
    public void nuroServices() {
        System.out.println("Fortis -- nuroServices");
    }

    //UKMedical
    @Override
    public void entServices() {
        System.out.println("Fortis -- entServices");
    }


    @Override
    public void pediaServices() {
        System.out.println("Fortis -- pediaServices");
    }

    @Override
    public void dermaServices() {
        System.out.println("Fortis -- dermaServices");
    }

    //USMedical
    @Override
    public void physioServices() {
        System.out.println("Fortis -- physioServices");
    }

    @Override
    public void oncologyServices() {
        System.out.println("Fortis --oncologyServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("Fortis --dentalServices");
    }

    @Override
    public void emergencyServices() { //common Method across all 3 interface
        System.out.println("Fortis --emergencyServices");
    }

    public void medicalTraining() {
        System.out.println("Fortis medicalTraining");
    }

    public void pathologyServices() {
        System.out.println("Fortis pathologyServices");

    }

    //Trying to override the default method of the interface
    @Override
    public void medicalInsurance() {
        System.out.println("Fortis -- Medical Insurance");
    }

    @Override
    public void covidVaccination() {
        System.out.println("Fortis -- covidVaccination");
    }

    @Override
    public void medicalRD(){
        System.out.println("Fortis Medical Research and Development");
    }
}
