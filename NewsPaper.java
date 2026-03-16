class NewsPaper{

int newspaperId;
String newspaperName;
String editorName;
String publisher;
String foundedYear;
String headquarters;
String language;
int totalPages;
double price;
boolean onlineEdition;
String publicationTime;
String country;
String circulationType;
String printingPress;
String category;
String website;
String subscriptionType;
String newspaperStatus;
String newspaperRating;
String specialEdition;

Article article;

NewsPaper(int newspaperId,String newspaperName,String editorName,String publisher,
String foundedYear,String headquarters,String language,int totalPages,double price,
boolean onlineEdition,String publicationTime,String country,String circulationType,
String printingPress,String category,String website,String subscriptionType,
String newspaperStatus,String newspaperRating,String specialEdition){

this.newspaperId=newspaperId;
this.newspaperName=newspaperName;
this.editorName=editorName;
this.publisher=publisher;
this.foundedYear=foundedYear;
this.headquarters=headquarters;
this.language=language;
this.totalPages=totalPages;
this.price=price;
this.onlineEdition=onlineEdition;
this.publicationTime=publicationTime;
this.country=country;
this.circulationType=circulationType;
this.printingPress=printingPress;
this.category=category;
this.website=website;
this.subscriptionType=subscriptionType;
this.newspaperStatus=newspaperStatus;
this.newspaperRating=newspaperRating;
this.specialEdition=specialEdition;

}

public void getNewsPaperDetails(){

System.out.println("Newspaper ID: "+this.newspaperId);
System.out.println("Newspaper Name: "+this.newspaperName);
System.out.println("Editor Name: "+this.editorName);
System.out.println("Publisher: "+this.publisher);
System.out.println("Founded Year: "+this.foundedYear);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Language: "+this.language);
System.out.println("Total Pages: "+this.totalPages);
System.out.println("Price: "+this.price);
System.out.println("Online Edition: "+this.onlineEdition);
System.out.println("Publication Time: "+this.publicationTime);
System.out.println("Country: "+this.country);
System.out.println("Circulation Type: "+this.circulationType);
System.out.println("Printing Press: "+this.printingPress);
System.out.println("Category: "+this.category);
System.out.println("Website: "+this.website);
System.out.println("Subscription Type: "+this.subscriptionType);
System.out.println("Newspaper Status: "+this.newspaperStatus);
System.out.println("Newspaper Rating: "+this.newspaperRating);
System.out.println("Special Edition: "+this.specialEdition);

this.article.getArticleDetails();

}

}