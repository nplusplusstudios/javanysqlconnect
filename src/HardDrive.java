
public class HardDrive extends Product{
    
    private String capacity;
    private int rpm;
    //"001","WD Hard Disk",15000,"1TB",7200
    public HardDrive(String pid, String title, float pri, String cap, int r){
        super(pid,title,pri);
        capacity = cap;
        rpm = r;
    }
    
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Capacity : " + capacity);
        System.out.println("RPM      : " + rpm);
    }
    
    
}
