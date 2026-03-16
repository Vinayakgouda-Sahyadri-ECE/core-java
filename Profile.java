class Profile{

int profileId;
String userName;
String headline;
String location;
String industry;
String education;
String university;
String company;
String jobTitle;
int experienceYears;
int connections;
String skills;
String certifications;
String languages;
String profileVisibility;
String contactEmail;
String portfolioLink;
String recommendationStatus;
String profileStatus;
String profileRating;

Profile(int profileId,String userName,String headline,String location,
String industry,String education,String university,String company,
String jobTitle,int experienceYears,int connections,String skills,
String certifications,String languages,String profileVisibility,
String contactEmail,String portfolioLink,String recommendationStatus,
String profileStatus,String profileRating){

this.profileId=profileId;
this.userName=userName;
this.headline=headline;
this.location=location;
this.industry=industry;
this.education=education;
this.university=university;
this.company=company;
this.jobTitle=jobTitle;
this.experienceYears=experienceYears;
this.connections=connections;
this.skills=skills;
this.certifications=certifications;
this.languages=languages;
this.profileVisibility=profileVisibility;
this.contactEmail=contactEmail;
this.portfolioLink=portfolioLink;
this.recommendationStatus=recommendationStatus;
this.profileStatus=profileStatus;
this.profileRating=profileRating;

}

public void getProfileDetails(){

System.out.println("--------------------------------");
System.out.println("Profile ID: "+this.profileId);
System.out.println("User Name: "+this.userName);
System.out.println("Headline: "+this.headline);
System.out.println("Location: "+this.location);
System.out.println("Industry: "+this.industry);
System.out.println("Education: "+this.education);
System.out.println("University: "+this.university);
System.out.println("Company: "+this.company);
System.out.println("Job Title: "+this.jobTitle);
System.out.println("Experience Years: "+this.experienceYears);
System.out.println("Connections: "+this.connections);
System.out.println("Skills: "+this.skills);
System.out.println("Certifications: "+this.certifications);
System.out.println("Languages: "+this.languages);
System.out.println("Profile Visibility: "+this.profileVisibility);
System.out.println("Contact Email: "+this.contactEmail);
System.out.println("Portfolio Link: "+this.portfolioLink);
System.out.println("Recommendation Status: "+this.recommendationStatus);
System.out.println("Profile Status: "+this.profileStatus);
System.out.println("Profile Rating: "+this.profileRating);

}

}