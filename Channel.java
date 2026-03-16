class Channel{

int channelNumber;
String channelName;
String channelCategory;
String language;
String broadcastCountry;
String hdQuality;
String ownerCompany;
String launchYear;
String popularShow;
int viewerRating;
String broadcastType;
boolean freeChannel;
String satelliteName;
String frequency;
String audioType;
String videoFormat;
String targetAudience;
String channelStatus;
String streamingPlatform;
String channelTagline;

Channel(int channelNumber,String channelName,String channelCategory,
String language,String broadcastCountry,String hdQuality,String ownerCompany,
String launchYear,String popularShow,int viewerRating,String broadcastType,
boolean freeChannel,String satelliteName,String frequency,String audioType,
String videoFormat,String targetAudience,String channelStatus,
String streamingPlatform,String channelTagline){

this.channelNumber=channelNumber;
this.channelName=channelName;
this.channelCategory=channelCategory;
this.language=language;
this.broadcastCountry=broadcastCountry;
this.hdQuality=hdQuality;
this.ownerCompany=ownerCompany;
this.launchYear=launchYear;
this.popularShow=popularShow;
this.viewerRating=viewerRating;
this.broadcastType=broadcastType;
this.freeChannel=freeChannel;
this.satelliteName=satelliteName;
this.frequency=frequency;
this.audioType=audioType;
this.videoFormat=videoFormat;
this.targetAudience=targetAudience;
this.channelStatus=channelStatus;
this.streamingPlatform=streamingPlatform;
this.channelTagline=channelTagline;

}

public void getChannelDetails(){

System.out.println("--------------------------------");
System.out.println("Channel Number: "+this.channelNumber);
System.out.println("Channel Name: "+this.channelName);
System.out.println("Channel Category: "+this.channelCategory);
System.out.println("Language: "+this.language);
System.out.println("Broadcast Country: "+this.broadcastCountry);
System.out.println("HD Quality: "+this.hdQuality);
System.out.println("Owner Company: "+this.ownerCompany);
System.out.println("Launch Year: "+this.launchYear);
System.out.println("Popular Show: "+this.popularShow);
System.out.println("Viewer Rating: "+this.viewerRating);
System.out.println("Broadcast Type: "+this.broadcastType);
System.out.println("Free Channel: "+this.freeChannel);
System.out.println("Satellite Name: "+this.satelliteName);
System.out.println("Frequency: "+this.frequency);
System.out.println("Audio Type: "+this.audioType);
System.out.println("Video Format: "+this.videoFormat);
System.out.println("Target Audience: "+this.targetAudience);
System.out.println("Channel Status: "+this.channelStatus);
System.out.println("Streaming Platform: "+this.streamingPlatform);
System.out.println("Channel Tagline: "+this.channelTagline);

}

}