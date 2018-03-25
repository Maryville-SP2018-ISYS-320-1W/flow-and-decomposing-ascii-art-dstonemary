/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    March-25-2018 
*/

// 4. Five start together in two lines.
//	  Combination of single and double start in three different lines.
//    Single start in three lines
//    Two empty line which keeps space between three different pattern.
/*
 * OUTPUT : 
  *****
  *****
   * *
    *
   * *


  *****
  *****
   * *
    *
   * *
  *****
  *****


    *
    *
    *
  *****
  *****
   * *
    *
   * *
 */

public class StarFigures {

	public static void main(String[] args) {
		fiveStartPatter();
		oneTwoStarPatter();
		emptyLine();
		
		fiveStartPatter();
		oneTwoStarPatter();
		fiveStartPatter();
		emptyLine();
		
		singleStarPatter();
		fiveStartPatter();
		oneTwoStarPatter();	
		
	}
	
	public static void fiveStartPatter(){
		System.out.println("  *****");
		System.out.println("  *****");
	}
	
	public static void oneTwoStarPatter(){
		System.out.println("   * *");
		System.out.println("    *");
		System.out.println("   * *");
	}
	
	public static void singleStarPatter(){
		for(int i=0;i<3;i++){
			System.out.println("    *");	
		}
	}
	public static void emptyLine(){
		System.out.println();
		System.out.println();
	}

}
