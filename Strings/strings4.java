public class strings4 {

    public static String toUpperCaseString(String str)
    {
        StringBuilder sbs=new StringBuilder();

        char ch=Character.toUpperCase(str.charAt(0));
        sbs.append(ch);

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) ==' ' && i<str.length()-1)
            {
                sbs.append(str.charAt(i));
                i++;
                sbs.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sbs.append(str.charAt(i));
            }

        }
        return sbs.toString();
    }
    public static void main(String args[])
    {
        //String comparison
        String str1="Tejas";
        String str2=new String("Tejas");

        System.out.println(str1.equals(str2));

        System.out.println(str1.substring(0, 3));

        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++)
        {
            if(largest.compareToIgnoreCase(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }

        System.out.println("Largest : "+largest);

        StringBuilder sb= new StringBuilder("");
        for(char ch ='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);

        String name="hi, i am tejas dadaji khairnar. nice to meet you..";
        System.out.println(toUpperCaseString(name));
    }
}
