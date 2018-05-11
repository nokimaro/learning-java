public class tuna {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int  m, int s) {
        hour = ((h>=0 && h<24) ? h : 0);
        minute = ((h>=0 && h<60) ? h : 0);
        second = ((h>=0 && h<60) ? h : 0);
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
