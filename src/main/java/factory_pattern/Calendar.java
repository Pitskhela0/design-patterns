package factory_pattern;

public abstract class Calendar {
    private Zone zone;
    public Calendar(String zoneID){
        this.zone = ZoneFactory.createZone(zoneID);
    }

    public void print(){
        System.out.println(zone.getDisplayName()+" "+zone.getOffset());
    }

    abstract public Calendar createCalendar();
}
