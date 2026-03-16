class Google {

    String name;
    String founder;
    String ceo;
    String headquarters;
    int employees;
    int foundedYear;
    double revenue;
    String product1;
    String product2;
    String product3;
    boolean publicCompany;
    String country;
    int offices;
    double marketCap;
    String website;
    String emailService;
    String cloudService;
    String operatingSystem;
    String searchEngine;
    String parentCompany;

    Google(String name,String founder,String ceo,String headquarters,int employees,
           int foundedYear,double revenue,String product1,String product2,String product3,
           boolean publicCompany,String country,int offices,double marketCap,String website,
           String emailService,String cloudService,String operatingSystem,String searchEngine,
           String parentCompany){

        this.name=name;
        this.founder=founder;
        this.ceo=ceo;
        this.headquarters=headquarters;
        this.employees=employees;
        this.foundedYear=foundedYear;
        this.revenue=revenue;
        this.product1=product1;
        this.product2=product2;
        this.product3=product3;
        this.publicCompany=publicCompany;
        this.country=country;
        this.offices=offices;
        this.marketCap=marketCap;
        this.website=website;
        this.emailService=emailService;
        this.cloudService=cloudService;
        this.operatingSystem=operatingSystem;
        this.searchEngine=searchEngine;
        this.parentCompany=parentCompany;
    }

    void display(){
		System.out.println("------------------");
        System.out.println(name);
        System.out.println(founder);
        System.out.println(ceo);
        System.out.println(headquarters);
        System.out.println(employees);
        System.out.println(foundedYear);
        System.out.println(revenue);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(publicCompany);
        System.out.println(country);
        System.out.println(offices);
        System.out.println(marketCap);
        System.out.println(website);
        System.out.println(emailService);
        System.out.println(cloudService);
        System.out.println(operatingSystem);
        System.out.println(searchEngine);
        System.out.println(parentCompany);
    }
}