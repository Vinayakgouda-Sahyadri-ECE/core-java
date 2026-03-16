class Stock{

int stockId;
String stockName;
String stockSymbol;
String companySector;
double currentPrice;
double marketCap;
String exchangeName;
String country;
String ipoYear;
double dailyHigh;
double dailyLow;
double yearlyHigh;
double yearlyLow;
String dividendType;
String ceoName;
String headquarters;
String stockType;
String stockStatus;
String analystRating;
String riskLevel;

Stock(int stockId,String stockName,String stockSymbol,String companySector,
double currentPrice,double marketCap,String exchangeName,String country,
String ipoYear,double dailyHigh,double dailyLow,double yearlyHigh,double yearlyLow,
String dividendType,String ceoName,String headquarters,String stockType,
String stockStatus,String analystRating,String riskLevel){

this.stockId=stockId;
this.stockName=stockName;
this.stockSymbol=stockSymbol;
this.companySector=companySector;
this.currentPrice=currentPrice;
this.marketCap=marketCap;
this.exchangeName=exchangeName;
this.country=country;
this.ipoYear=ipoYear;
this.dailyHigh=dailyHigh;
this.dailyLow=dailyLow;
this.yearlyHigh=yearlyHigh;
this.yearlyLow=yearlyLow;
this.dividendType=dividendType;
this.ceoName=ceoName;
this.headquarters=headquarters;
this.stockType=stockType;
this.stockStatus=stockStatus;
this.analystRating=analystRating;
this.riskLevel=riskLevel;

}

public void getStockDetails(){

System.out.println("--------------------------------");
System.out.println("Stock ID: "+this.stockId);
System.out.println("Stock Name: "+this.stockName);
System.out.println("Stock Symbol: "+this.stockSymbol);
System.out.println("Company Sector: "+this.companySector);
System.out.println("Current Price: "+this.currentPrice);
System.out.println("Market Cap: "+this.marketCap);
System.out.println("Exchange Name: "+this.exchangeName);
System.out.println("Country: "+this.country);
System.out.println("IPO Year: "+this.ipoYear);
System.out.println("Daily High: "+this.dailyHigh);
System.out.println("Daily Low: "+this.dailyLow);
System.out.println("Yearly High: "+this.yearlyHigh);
System.out.println("Yearly Low: "+this.yearlyLow);
System.out.println("Dividend Type: "+this.dividendType);
System.out.println("CEO Name: "+this.ceoName);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Stock Type: "+this.stockType);
System.out.println("Stock Status: "+this.stockStatus);
System.out.println("Analyst Rating: "+this.analystRating);
System.out.println("Risk Level: "+this.riskLevel);

}

}