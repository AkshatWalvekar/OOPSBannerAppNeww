


import java.util.Scanner;

class OOPSBannerApp{
	static class CharacterPatternMap{
		String[] pattern;
		Character character;
		CharacterPatternMap(Character character,String[] pattern){
			this.character=character;
			this.pattern=pattern;
		
		}
		
	}
    public static CharacterPatternMap[] createCharacterPatternMaps(){
		
        String getpatternO[]={
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "	
        };
        String getpatternP[]={
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
        String getpatternS[]={
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
		String patternspace[]={
			" ",
			" ",
			" ",
			" ",
			" ",
			" ",
			" ",
			" ",
			" "
		};
		CharacterPatternMap a=new CharacterPatternMap('o',getpatternO);
		CharacterPatternMap b=new CharacterPatternMap('p',getpatternP);
		CharacterPatternMap c=new CharacterPatternMap('s',getpatternS);
		CharacterPatternMap d=new CharacterPatternMap(' ',patternspace);
		return new CharacterPatternMap[]{a,b,c,d};
			
        		
	}
    public static String[] getCharacterPattern(char ch,CharacterPatternMap[] charMaps){
		for(CharacterPatternMap charac:charMaps){
            if(charac.character.equals(ch)){
				String getp[]=charac.pattern;
				return getp;
			}	
		}
		return new String[]{" "};
    }	
    public static void printMessage(String message,CharacterPatternMap[] charMaps){
		char ch[]=message.toCharArray();
		StringBuilder[] lines=new StringBuilder[9];
		for(int i=0;i<lines.length;i++){
			lines[i]=new StringBuilder();
		}
		
		for(char chh:ch){
			String newpat[]=getCharacterPattern(chh,charMaps);
			
		for(int i=0;i<9;i++){
		lines[i].append(newpat[i]).append(" ");
			}
		}
		
		for(StringBuilder l:lines){
			System.out.println(l.toString());
		}
}
	
	public static void main(String[] args){
		CharacterPatternMap[] mp=createCharacterPatternMaps();
		System.out.println("Enter a string in lowercase:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printMessage(s,mp);
    }
}	
	
    	