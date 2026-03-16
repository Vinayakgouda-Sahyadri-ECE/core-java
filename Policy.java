class Policy{

int policyId;
String policyName;
String policyType;
String policyCategory;
String launchYear;
String targetSector;
String beneficiaryGroup;
String coverageArea;
double policyBudget;
String implementingAgency;
String approvalAuthority;
String policyDuration;
String eligibilityCriteria;
String applicationMode;
String monitoringAuthority;
String impactLevel;
String policyStatus;
String policyReview;
String policyPriority;
String policyRating;

Policy(int policyId,String policyName,String policyType,String policyCategory,
String launchYear,String targetSector,String beneficiaryGroup,String coverageArea,
double policyBudget,String implementingAgency,String approvalAuthority,String policyDuration,
String eligibilityCriteria,String applicationMode,String monitoringAuthority,String impactLevel,
String policyStatus,String policyReview,String policyPriority,String policyRating){

this.policyId=policyId;
this.policyName=policyName;
this.policyType=policyType;
this.policyCategory=policyCategory;
this.launchYear=launchYear;
this.targetSector=targetSector;
this.beneficiaryGroup=beneficiaryGroup;
this.coverageArea=coverageArea;
this.policyBudget=policyBudget;
this.implementingAgency=implementingAgency;
this.approvalAuthority=approvalAuthority;
this.policyDuration=policyDuration;
this.eligibilityCriteria=eligibilityCriteria;
this.applicationMode=applicationMode;
this.monitoringAuthority=monitoringAuthority;
this.impactLevel=impactLevel;
this.policyStatus=policyStatus;
this.policyReview=policyReview;
this.policyPriority=policyPriority;
this.policyRating=policyRating;

}

public void getPolicyDetails(){

System.out.println("--------------------------------");
System.out.println("Policy ID: "+this.policyId);
System.out.println("Policy Name: "+this.policyName);
System.out.println("Policy Type: "+this.policyType);
System.out.println("Policy Category: "+this.policyCategory);
System.out.println("Launch Year: "+this.launchYear);
System.out.println("Target Sector: "+this.targetSector);
System.out.println("Beneficiary Group: "+this.beneficiaryGroup);
System.out.println("Coverage Area: "+this.coverageArea);
System.out.println("Policy Budget: "+this.policyBudget);
System.out.println("Implementing Agency: "+this.implementingAgency);
System.out.println("Approval Authority: "+this.approvalAuthority);
System.out.println("Policy Duration: "+this.policyDuration);
System.out.println("Eligibility Criteria: "+this.eligibilityCriteria);
System.out.println("Application Mode: "+this.applicationMode);
System.out.println("Monitoring Authority: "+this.monitoringAuthority);
System.out.println("Impact Level: "+this.impactLevel);
System.out.println("Policy Status: "+this.policyStatus);
System.out.println("Policy Review: "+this.policyReview);
System.out.println("Policy Priority: "+this.policyPriority);
System.out.println("Policy Rating: "+this.policyRating);

}

}