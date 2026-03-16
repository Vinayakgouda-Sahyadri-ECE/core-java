class Frame{

int frameId;
String frameBrand;
String frameType;
String frameMaterial;
String frameColor;
String frameShape;
String lensType;
String lensPower;
boolean blueLightFilter;
boolean antiGlare;
String frameSize;
String frameWeight;
String hingeType;
String nosePadType;
boolean flexibleFrame;
String frameCategory;
String targetGender;
String manufacturingCountry;
String frameQuality;
String frameStatus;

Frame(int frameId,String frameBrand,String frameType,String frameMaterial,
String frameColor,String frameShape,String lensType,String lensPower,
boolean blueLightFilter,boolean antiGlare,String frameSize,String frameWeight,
String hingeType,String nosePadType,boolean flexibleFrame,String frameCategory,
String targetGender,String manufacturingCountry,String frameQuality,
String frameStatus){

this.frameId=frameId;
this.frameBrand=frameBrand;
this.frameType=frameType;
this.frameMaterial=frameMaterial;
this.frameColor=frameColor;
this.frameShape=frameShape;
this.lensType=lensType;
this.lensPower=lensPower;
this.blueLightFilter=blueLightFilter;
this.antiGlare=antiGlare;
this.frameSize=frameSize;
this.frameWeight=frameWeight;
this.hingeType=hingeType;
this.nosePadType=nosePadType;
this.flexibleFrame=flexibleFrame;
this.frameCategory=frameCategory;
this.targetGender=targetGender;
this.manufacturingCountry=manufacturingCountry;
this.frameQuality=frameQuality;
this.frameStatus=frameStatus;

}

public void getFrameDetails(){

System.out.println("------------------------------------");
System.out.println("Frame ID: "+this.frameId);
System.out.println("Frame Brand: "+this.frameBrand);
System.out.println("Frame Type: "+this.frameType);
System.out.println("Frame Material: "+this.frameMaterial);
System.out.println("Frame Color: "+this.frameColor);
System.out.println("Frame Shape: "+this.frameShape);
System.out.println("Lens Type: "+this.lensType);
System.out.println("Lens Power: "+this.lensPower);
System.out.println("Blue Light Filter: "+this.blueLightFilter);
System.out.println("Anti Glare: "+this.antiGlare);
System.out.println("Frame Size: "+this.frameSize);
System.out.println("Frame Weight: "+this.frameWeight);
System.out.println("Hinge Type: "+this.hingeType);
System.out.println("Nose Pad Type: "+this.nosePadType);
System.out.println("Flexible Frame: "+this.flexibleFrame);
System.out.println("Frame Category: "+this.frameCategory);
System.out.println("Target Gender: "+this.targetGender);
System.out.println("Manufacturing Country: "+this.manufacturingCountry);
System.out.println("Frame Quality: "+this.frameQuality);
System.out.println("Frame Status: "+this.frameStatus);

}

}