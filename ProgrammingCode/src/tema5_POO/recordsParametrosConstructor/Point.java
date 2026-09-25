package tema5_POO.recordsParametrosConstructor;

public record Point(int x, int y) {
	
	public Point {
		
		if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        
    }	
	
}
