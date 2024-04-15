package MODEL;
public class Model_fees {
    String student_names ;
    String reg_number ;
    String department ;
    int academic_year ;
    String programme ;
    double trimester_fees ;
    double Supervision_fees;
    double registration_fees ;
    double graduation_fees ;

    public Model_fees() {
    }

    public Model_fees(String student_names, String reg_number, String department, int academic_year, String programme, double trimester_fees, double Supervision_fees, double registration_fees, double graduation_fees) {
        this.student_names = student_names;
        this.reg_number = reg_number;
        this.department = department;
        this.academic_year = academic_year;
        this.programme = programme;
        this.trimester_fees = trimester_fees;
        this.Supervision_fees = Supervision_fees;
        this.registration_fees = registration_fees;
        this.graduation_fees = graduation_fees;
    }

    public String getStudent_names() {
        return student_names;
    }

    public void setStudent_names(String student_names) {
        this.student_names = student_names;
    }

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public double getTrimester_fees() {
        return trimester_fees;
    }

    public void setTrimester_fees(double trimester_fees) {
        this.trimester_fees = trimester_fees;
    }

    public double getSupervision_fees() {
        return Supervision_fees;
    }

    public void setSupervision_fees(double Supervision_fees) {
        this.Supervision_fees = Supervision_fees;
    }

    public double getRegistration_fees() {
        return registration_fees;
    }

    public void setRegistration_fees(double registration_fees) {
        this.registration_fees = registration_fees;
    }

    public double getGraduation_fees() {
        return graduation_fees;
    }

    public void setGraduation_fees(double graduation_fees) {
        this.graduation_fees = graduation_fees;
    }



 

    
    
    
}
