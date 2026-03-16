class Education {

    String institutionName;
    String courseName;
    String degreeType;
    String department;
    String university;
    String city;
    String country;
    int durationYears;
    int totalStudents;
    int totalFaculty;
    boolean scholarshipAvailable;
    boolean hostelAvailable;
    String mediumOfInstruction;
    double fees;
    String accreditation;
    String ranking;
    String startYear;
    String examType;
    String educationMode;
    String remarks;

    Education(String institutionName,String courseName,String degreeType,String department,
              String university,String city,String country,int durationYears,
              int totalStudents,int totalFaculty,boolean scholarshipAvailable,
              boolean hostelAvailable,String mediumOfInstruction,double fees,
              String accreditation,String ranking,String startYear,
              String examType,String educationMode,String remarks){

        this.institutionName = institutionName;
        this.courseName = courseName;
        this.degreeType = degreeType;
        this.department = department;
        this.university = university;
        this.city = city;
        this.country = country;
        this.durationYears = durationYears;
        this.totalStudents = totalStudents;
        this.totalFaculty = totalFaculty;
        this.scholarshipAvailable = scholarshipAvailable;
        this.hostelAvailable = hostelAvailable;
        this.mediumOfInstruction = mediumOfInstruction;
        this.fees = fees;
        this.accreditation = accreditation;
        this.ranking = ranking;
        this.startYear = startYear;
        this.examType = examType;
        this.educationMode = educationMode;
        this.remarks = remarks;
    }

    void display(){

		System.out.println("--------------");
        System.out.println(institutionName);
        System.out.println(courseName);
        System.out.println(degreeType);
        System.out.println(department);
        System.out.println(university);
        System.out.println(city);
        System.out.println(country);
        System.out.println(durationYears);
        System.out.println(totalStudents);
        System.out.println(totalFaculty);
        System.out.println(scholarshipAvailable);
        System.out.println(hostelAvailable);
        System.out.println(mediumOfInstruction);
        System.out.println(fees);
        System.out.println(accreditation);
        System.out.println(ranking);
        System.out.println(startYear);
        System.out.println(examType);
        System.out.println(educationMode);
        System.out.println(remarks);
    }
}