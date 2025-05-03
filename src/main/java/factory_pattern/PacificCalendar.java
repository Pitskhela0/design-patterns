package factory_pattern;

public class PacificCalendar extends Calendar{
    public PacificCalendar(Zone zone) {
        super(zone);
    }

    @Override
    public Calendar createCalendar() {
        return new PacificCalendar(new Zone("displayName", "offset"));
    }
}
