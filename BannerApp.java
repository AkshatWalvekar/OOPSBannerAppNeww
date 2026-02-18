
/*
@author Developer
@version 4
*/




class Array
{
	public static void main(String[]args)
	{
		String[] arr = new String[7];
	
		arr[0] = (String.join(" ", "   ***   ", "   ***   ", "*********", "   *****"));
		arr[1] = (String.join(" ", " **   ** ", " **   ** ", "**     **", " **     "));
		arr[2] = (String.join(" ", "**     **", "**     **", "**     **", "**      "));
		arr[3] = (String.join(" ", "**     **", "**     **", "*********", "  ***** "));
		arr[4] = (String.join(" ", "**     **", "**     **", "**       ", "      **"));
		arr[5] = (String.join(" ", " **   ** ", " **   ** ", "**       ", " **   **"));
		arr[6] = (String.join(" ", "   ***   ", "   ***   ", "**       ", "  ***** "));
		
		for(String str: arr){
		System.out.println(str);
		}
	}
}