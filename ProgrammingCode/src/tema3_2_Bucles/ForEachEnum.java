package tema3_2_Bucles;

public class ForEachEnum {

	public enum DayOfWeek {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public void show() {
		
		for (DayOfWeek d : DayOfWeek.values()) {
			System.out.println(d);
		}
		
	}

	public static void main(String[] args) {

		new ForEachEnum().show();
		
	}

}
