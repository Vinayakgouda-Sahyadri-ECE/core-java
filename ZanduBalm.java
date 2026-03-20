class ZanduBalm{
    double netWeight;
    String containerType;
    String balmColor;
    double viscosity;
    String aromaProfile;

    double mentholContent;
    double camphorContent;
    double eucalyptusOilMg;
    double gaultheriaOilMg;
    String baseMaterial;

    String batchNumber;
    String manufactureDate;
    int expiryDate;
    String factoryLocation;
    boolean isSealIntact;

    double price;
    String currency;
    long barCode;
    String targetedRelief;
    int shelfLifeMonths;
	
	ZanduBalm(){
	this(24.99,"Rupees",15);
	System.out.println("End");
	
	
	}
	
	ZanduBalm(  double mentholContent,double camphorContent,String batchNumber){
		this(7);
		System.out.println("The variiables are:"+mentholContent+","+camphorContent+","+batchNumber);
		this.mentholContent=mentholContent;
		this.camphorContent=camphorContent;
		this.batchNumber=batchNumber;
	}
	
	ZanduBalm(int shelfLifeMonths){
		this(shelfLifeMonths,"Green");
		System.out.println("The variablle is :"+shelfLifeMonths);
		this.shelfLifeMonths=shelfLifeMonths;
	}
	
	
	
	
	ZanduBalm(double price,String currency,double netWeight){
		this(2.05,5.46,"KA2026");
		System.out.println("The variables are:"+price+","+currency+","+netWeight);
		this.price=price;
		this.currency=currency;
		this.netWeight=netWeight;
		
	}
	
	ZanduBalm(int shelfLifeMonths,String balmColor){
		System.out.println("The variables are:"+shelfLifeMonths+","+balmColor);
		this.shelfLifeMonths=shelfLifeMonths;
		this.balmColor=balmColor;
		
	}
}