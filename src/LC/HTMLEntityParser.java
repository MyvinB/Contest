package LC;

import java.util.HashMap;

/*
 @author Myvin Barboza
 12/04/20 8:49 AM 
 */public class HTMLEntityParser {

    static String entityParser(String text) {
        HashMap<String ,String> map=new HashMap<>();
        map.put("&quot;","\"");
        map.put("&apos;","\'");
        map.put("&amp;","&");
        map.put("&gt;",">");
        map.put("&lt;","<");
        map.put("&frasl;","/");
        for (String e:map.keySet()){
            if(text.contains(e)){

                text=text.replace(e,map.get(e));
            }
        }

        return text;
    }


     public static void main(String[] args) {
//            String s="&amp; is an HTML entity but &ambassador; is not.";
//            s=s.replace("&amp","&");

            System.out.println(entityParser("x &gt; y &amp;&amp; x &lt; y is always false\""));
    }
}