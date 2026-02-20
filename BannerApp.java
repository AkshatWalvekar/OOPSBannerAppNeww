


import java.util.*;

class BannerApp{
		
    public static HashMap<Character, String[]> createCharacterMap(){
		
		HashMap<Character, String[]> charMap = new HashMap<>();
		
		String[] patternO = {
                "  ***   ",
                " ** **  ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                " ** **  ",
                "  ***   "
        };

        String[] patternP = {
                " ****** ",
                " **   **",
                " **   **",
                " **   **",
                " ****** ",
                " **     ",
                " **     ",
                " **     ",
                " **     "
        };

        String[] patternS = {
                " ***** ",
                " **    ",
                " **    ",
                " **    ",
                "  ***  ",
                "    ** ",
                "    ** ",
                "    ** ",
                " ***** "
        };

        

        // Store patterns in HashMap
        charMap.put('O', patternO);
        charMap.put('P', patternP);
        charMap.put('S', patternS);

        return charMap;
    }
			
        		
	public static void displayBanner(HashMap<Character,String[]>map,String message){
		for(int i=0;i<9;i++){
			StringBuilder str=new StringBuilder();
			for(int j=0;j<message.length();j++){
				String[] temp = map.get(message.charAt(j));
				str.append(temp[i]);
			}
			System.out.println(str);
			
		}
    }	
		
	public static void main(String args[]){
		HashMap<Character,String[]>map = createCharacterMap();
		String message = "OOPS";
		displayBanner(map,message);
		
	}
}