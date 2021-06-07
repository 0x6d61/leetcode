package P1704;

public class P1704 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.halvesAreAlike("ioeuAOASOiocAeanuEOITeAaZeUEoIeOoIuOEuUuIoiAoOUOEuuOuaEiAWEoioiIaUAeauoIOiOIIoAuaAUuEUOeaoXoEEUuoUoOEIEELUeoIOAAiEoAiaUIaeUIoIiOaaEoIiiIUaeeoiAxOeEIOieueeaaUAOiIOTaAIiIIUAeOoeUOiuUOeEIoUiUIiiAoeoUIieEaaeEoUOOUhEeilouEIVauKioAOAAoaIoUoIiOIuavOEieUeuOOuIiAiiueEUagiUZiueoAiUPueAAOIeUaiOaeeAEOEauEeOOIoUEeaEOiOEUAeuhaiEEAUIoEIIoeAeEOAoUiIuooIsOUAuiEaIUEeeouIoEoeoIouueoaOEuua"));
    }
}

class Solution {
    public boolean halvesAreAlike(String s) {
        String boin = "aeiouAEIOU"; 
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2, s.length());
        System.out.println(a);
        System.out.println(b);
        var aCount = a.chars().mapToObj(i -> String.valueOf((char)i)).map(w -> {
            if (boin.indexOf(w) != -1) {
                return 1;
            }else{
                return 0;
            }
        }).reduce(0,(acc,val) -> acc+=val);

        var bCount = b.chars().mapToObj(i -> String.valueOf((char)i)).map(w -> {
            if (boin.indexOf(w) != -1) {
                return 1;
            }else{
                return 0;
            }
        }).reduce(0,(acc,val) -> acc+=val);
        System.out.println(aCount);
        System.out.println(bCount);
        if (aCount.equals(bCount)) {
            return true;
        }else{
            return false;
        }
    }
}