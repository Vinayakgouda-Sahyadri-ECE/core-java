class LinkedInExecutor{

public static void main(String[] args){

LinkedIn l1 = new LinkedIn(1,"LinkedIn","Reid Hoffman","2003","California","USA",900000000,"Ryan Roslansky","Professional Network",true,true,"Career Growth","Available","Available","Yes","Yes","Blue Tick","High","Active","5");
Profile p1 = new Profile(101,"Tarun","Software Developer","Bangalore","IT","B.Tech","VTU","ABC Tech","Java Developer",2,500,"Java, SQL","Oracle Java","English","Public","tarun@mail.com","github.com/tarun","Good","Active","4.5");
l1.profile=p1;
l1.getLinkedInDetails();

System.out.println();

LinkedIn l2 = new LinkedIn(2,"LinkedIn","Reid Hoffman","2003","California","USA",900000000,"Ryan Roslansky","Professional Network",true,true,"Job Search","Available","Available","Yes","Yes","Blue Tick","High","Active","5");
Profile p2 = new Profile(102,"Rahul","Data Analyst","Delhi","IT","B.Tech","IIT","XYZ Analytics","Analyst",3,600,"Python, SQL","Google Data","English","Public","rahul@mail.com","github.com/rahul","Good","Active","4.6");
l2.profile=p2;
l2.getLinkedInDetails();

System.out.println();

LinkedIn l3 = new LinkedIn(3,"LinkedIn","Reid Hoffman","2003","California","USA",900000000,"Ryan Roslansky","Professional Network",true,true,"Networking","Available","Available","Yes","Yes","Blue Tick","High","Active","5");
Profile p3 = new Profile(103,"Anita","UI Designer","Mumbai","Design","B.Design","NID","Creative Studio","Designer",4,700,"Figma, UI","UX Cert","English","Public","anita@mail.com","portfolio.com/anita","Good","Active","4.7");
l3.profile=p3;
l3.getLinkedInDetails();

System.out.println();

LinkedIn l4 = new LinkedIn(4,"LinkedIn","Reid Hoffman","2003","California","USA",900000000,"Ryan Roslansky","Professional Network",true,true,"Professional Branding","Available","Available","Yes","Yes","Blue Tick","High","Active","5");
Profile p4 = new Profile(104,"Kiran","DevOps Engineer","Hyderabad","IT","B.Tech","JNTU","CloudTech","DevOps",5,800,"AWS, Docker","AWS Cert","English","Public","kiran@mail.com","github.com/kiran","Good","Active","4.6");
l4.profile=p4;
l4.getLinkedInDetails();

System.out.println();

LinkedIn l5 = new LinkedIn(5,"LinkedIn","Reid Hoffman","2003","California","USA",900000000,"Ryan Roslansky","Professional Network",true,true,"Hiring","Available","Available","Yes","Yes","Blue Tick","High","Active","5");
Profile p5 = new Profile(105,"Sneha","HR Manager","Pune","HR","MBA","Symbiosis","People Corp","HR",6,900,"Recruitment","HR Cert","English","Public","sneha@mail.com","linkedin.com/sneha","Good","Active","4.8");
l5.profile=p5;
l5.getLinkedInDetails();

}

}
