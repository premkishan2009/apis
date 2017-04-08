package math;

public class SUM {

    private final long x;
    private final long y;

    public SUM(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
    
    public long getSUM(){
    	return x + y;
    }
    
    public String getKey(){
    	return x + "+" + y;
    }
}