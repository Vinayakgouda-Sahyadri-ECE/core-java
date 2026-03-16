class Article{

int articleId;
String articleTitle;
String authorName;
String category;
String publicationDate;
int wordCount;
String articleLanguage;
String headline;
String summary;
String keywords;
String editorApproval;
String articleStatus;
String articleType;
String referenceSource;
String publishingCity;
String section;
String readingTime;
String articleFormat;
String articleRating;
String audienceType;

Article(int articleId,String articleTitle,String authorName,String category,
String publicationDate,int wordCount,String articleLanguage,String headline,
String summary,String keywords,String editorApproval,String articleStatus,
String articleType,String referenceSource,String publishingCity,String section,
String readingTime,String articleFormat,String articleRating,String audienceType){

this.articleId=articleId;
this.articleTitle=articleTitle;
this.authorName=authorName;
this.category=category;
this.publicationDate=publicationDate;
this.wordCount=wordCount;
this.articleLanguage=articleLanguage;
this.headline=headline;
this.summary=summary;
this.keywords=keywords;
this.editorApproval=editorApproval;
this.articleStatus=articleStatus;
this.articleType=articleType;
this.referenceSource=referenceSource;
this.publishingCity=publishingCity;
this.section=section;
this.readingTime=readingTime;
this.articleFormat=articleFormat;
this.articleRating=articleRating;
this.audienceType=audienceType;

}

public void getArticleDetails(){

System.out.println("--------------------------------");
System.out.println("Article ID: "+this.articleId);
System.out.println("Article Title: "+this.articleTitle);
System.out.println("Author Name: "+this.authorName);
System.out.println("Category: "+this.category);
System.out.println("Publication Date: "+this.publicationDate);
System.out.println("Word Count: "+this.wordCount);
System.out.println("Language: "+this.articleLanguage);
System.out.println("Headline: "+this.headline);
System.out.println("Summary: "+this.summary);
System.out.println("Keywords: "+this.keywords);
System.out.println("Editor Approval: "+this.editorApproval);
System.out.println("Article Status: "+this.articleStatus);
System.out.println("Article Type: "+this.articleType);
System.out.println("Reference Source: "+this.referenceSource);
System.out.println("Publishing City: "+this.publishingCity);
System.out.println("Section: "+this.section);
System.out.println("Reading Time: "+this.readingTime);
System.out.println("Article Format: "+this.articleFormat);
System.out.println("Article Rating: "+this.articleRating);
System.out.println("Audience Type: "+this.audienceType);

}

}