class PVRRunner {

    public static void main(String[] args) {

        PVR p1 = new PVR("PVR Orion","Mall","Bangalore","IMAX",12,2000,350,true,true,"Dolby","Digital","PVR Ltd",2015,4.5,"pvrcinemas.com","080123456",true,"India","Recliner","CinemaSuppliers");
        PVR p2 = new PVR("PVR Forum","Mall","Bangalore","4DX",10,1800,300,true,true,"Dolby","Laser","PVR Ltd",2013,4.3,"pvrcinemas.com","080123457",true,"India","Recliner","CinemaSuppliers");
        PVR p3 = new PVR("PVR Phoenix","Mall","Mumbai","IMAX",14,2200,400,true,true,"Dolby","Digital","PVR Ltd",2018,4.6,"pvrcinemas.com","022123458",true,"India","Premium","CinemaSuppliers");
        PVR p4 = new PVR("PVR Select","Mall","Delhi","Standard",8,1500,250,false,true,"Dolby","Digital","PVR Ltd",2012,4.1,"pvrcinemas.com","011123459",true,"India","Normal","CinemaSuppliers");
        PVR p5 = new PVR("PVR Central","Mall","Hyderabad","IMAX",11,1900,320,true,true,"Dolby","Laser","PVR Ltd",2016,4.4,"pvrcinemas.com","040123450",true,"India","Recliner","CinemaSuppliers");
        PVR p6 = new PVR("PVR Galaxy","Mall","Chennai","Standard",7,1400,220,false,true,"Dolby","Digital","PVR Ltd",2011,4.0,"pvrcinemas.com","044123451",true,"India","Normal","CinemaSuppliers");
        PVR p7 = new PVR("PVR Plaza","Mall","Pune","IMAX",9,1600,300,true,true,"Dolby","Laser","PVR Ltd",2014,4.2,"pvrcinemas.com","020123452",true,"India","Recliner","CinemaSuppliers");
        PVR p8 = new PVR("PVR City","Mall","Kolkata","Standard",6,1200,200,false,true,"Dolby","Digital","PVR Ltd",2010,3.9,"pvrcinemas.com","033123453",true,"India","Normal","CinemaSuppliers");
        PVR p9 = new PVR("PVR Grand","Mall","Ahmedabad","IMAX",10,1700,330,true,true,"Dolby","Laser","PVR Ltd",2017,4.3,"pvrcinemas.com","079123454",true,"India","Premium","CinemaSuppliers");
        PVR p10 = new PVR("PVR Mega","Mall","Bangalore","4DX",13,2100,380,true,true,"Dolby","Laser","PVR Ltd",2019,4.6,"pvrcinemas.com","080123455",true,"India","Premium","CinemaSuppliers");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
        p7.display();
        p8.display();
        p9.display();
        p10.display();
    }
}