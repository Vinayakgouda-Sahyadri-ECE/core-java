class PCExecutor{

public static void main(String[] args){

PC pc1 = new PC(1,"Dell","Intel i7","Windows 11",16,512,"NVIDIA GTX 1650","Dell Motherboard","500W","ATX",true,true,"LED","Mechanical","Optical","Stereo","Liquid","Black","Gaming","Active");
Hardware h1 = new Hardware(101,"Intel i7","DDR4","SSD","GTX 1650","Dell Board","500W PSU","Cooler Master",true,"Corsair","Dell","Logitech","HP","Sony","Intel LAN","Realtek","6 USB","2 HDMI","New","Working");
pc1.hardware = h1;
pc1.getPCDetails();

System.out.println();
PC pc2 = new PC(2,"HP","Intel i5","Windows 10",8,512,"Intel UHD","HP Board","450W","Mini Tower",true,true,"LCD","Standard","Optical","Stereo","Air","Silver","Office","Active");
Hardware h2 = new Hardware(102,"Intel i5","DDR4","SSD","Integrated","HP Board","450W PSU","Cooler",false,"HP","HP","Dell","HP","Creative","Intel LAN","Realtek","4 USB","1 HDMI","New","Working");
pc2.hardware = h2;
pc2.getPCDetails();

System.out.println();
PC pc3 = new PC(3,"Lenovo","Intel i9","Windows 11",32,1024,"RTX 3060","Lenovo Board","650W","ATX",true,true,"LED","Mechanical","Gaming Mouse","Surround","Liquid","Black","Gaming","Active");
Hardware h3 = new Hardware(103,"Intel i9","DDR5","SSD","RTX 3060","Lenovo Board","650W PSU","DeepCool",true,"NZXT","Samsung","Razer","Razer","Logitech","Intel LAN","Realtek","8 USB","2 HDMI","New","Working");
pc3.hardware = h3;
pc3.getPCDetails();

System.out.println();
PC pc4 = new PC(4,"Asus","Ryzen 7","Windows 11",16,512,"RTX 3050","Asus Board","600W","ATX",true,true,"LED","Mechanical","Optical","Stereo","Liquid","Black","Gaming","Active");
Hardware h4 = new Hardware(104,"Ryzen 7","DDR4","SSD","RTX 3050","Asus Board","600W PSU","Cooler Master",true,"Corsair","LG","Logitech","HP","Sony","Realtek LAN","Realtek","6 USB","2 HDMI","New","Working");
pc4.hardware = h4;
pc4.getPCDetails();

System.out.println();
PC pc5 = new PC(5,"Acer","Intel i5","Windows 10",8,256,"Intel UHD","Acer Board","400W","Mini Tower",true,true,"LCD","Standard","Optical","Stereo","Air","White","Office","Active");
Hardware h5 = new Hardware(105,"Intel i5","DDR4","SSD","Integrated","Acer Board","400W PSU","Cooler",false,"Acer","Acer","Dell","HP","Creative","Intel LAN","Realtek","4 USB","1 HDMI","New","Working");
pc5.hardware = h5;
pc5.getPCDetails();

System.out.println();
PC pc6 = new PC(6,"MSI","Ryzen 9","Windows 11",32,2048,"RTX 4080","MSI Board","750W","ATX",true,true,"LED","Mechanical","Gaming Mouse","Surround","Liquid","Black","Gaming","Active");
Hardware h6 = new Hardware(106,"Ryzen 9","DDR5","SSD","RTX 4080","MSI Board","750W PSU","NZXT",true,"Corsair","Samsung","Razer","Razer","Logitech","Intel LAN","Realtek","10 USB","3 HDMI","New","Working");
pc6.hardware = h6;
pc6.getPCDetails();

System.out.println();
PC pc7 = new PC(7,"Apple","M2","MacOS",16,512,"Apple GPU","Apple Board","Custom","Compact",true,true,"Retina","Magic","Magic Mouse","Stereo","Air","Silver","Professional","Active");
Hardware h7 = new Hardware(107,"Apple M2","Unified","SSD","Apple GPU","Apple Board","Custom PSU","Silent Fan",false,"Apple","Apple","Apple","Apple","Apple","Apple LAN","Apple","4 USB","1 HDMI","New","Working");
pc7.hardware = h7;
pc7.getPCDetails();

System.out.println();
PC pc8 = new PC(8,"Samsung","Intel i3","Windows 10",8,256,"Intel UHD","Samsung Board","350W","Mini",true,true,"LCD","Standard","Optical","Stereo","Air","Gray","Office","Active");
Hardware h8 = new Hardware(108,"Intel i3","DDR4","SSD","Integrated","Samsung Board","350W PSU","Cooler",false,"Samsung","Samsung","Dell","HP","Creative","Intel LAN","Realtek","4 USB","1 HDMI","New","Working");
pc8.hardware = h8;
pc8.getPCDetails();

System.out.println();
PC pc9 = new PC(9,"Dell","Ryzen 5","Windows 11",16,512,"RTX 2060","Dell Board","550W","ATX",true,true,"LED","Mechanical","Gaming Mouse","Surround","Liquid","Black","Gaming","Active");
Hardware h9 = new Hardware(109,"Ryzen 5","DDR4","SSD","RTX 2060","Dell Board","550W PSU","Cooler Master",true,"Corsair","LG","Logitech","HP","Sony","Intel LAN","Realtek","6 USB","2 HDMI","New","Working");
pc9.hardware = h9;
pc9.getPCDetails();

System.out.println();
PC pc10 = new PC(10,"Lenovo","Intel i7","Windows 11",16,1024,"RTX 3070","Lenovo Board","650W","ATX",true,true,"LED","Mechanical","Gaming Mouse","Surround","Liquid","Black","Gaming","Active");
Hardware h10 = new Hardware(110,"Intel i7","DDR5","SSD","RTX 3070","Lenovo Board","650W PSU","DeepCool",true,"NZXT","Samsung","Razer","Razer","Logitech","Intel LAN","Realtek","8 USB","2 HDMI","New","Working");
pc10.hardware = h10;
pc10.getPCDetails();

}
}