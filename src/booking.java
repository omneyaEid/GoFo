import java.util.Scanner;
import java.util.regex.Pattern;

public class booking {
	 private String Playground;
	 private int hour;
	 public void set_playground (String playground )
	 {
		 this.Playground= playground;
	 }
	 
	 public void set_hour (int hour)
	 {
		 this.hour= hour;
	 }
	 public int get_hour ()
	 {
		 return hour;
	 }
	 public String get_playground ()
	 {
		 return Playground;
	 }
	
   }