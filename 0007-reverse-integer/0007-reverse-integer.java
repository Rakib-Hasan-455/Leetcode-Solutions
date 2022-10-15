class Solution {
    public int reverse(int x) {
        String xx = x + "";
        String revStr = new StringBuffer(xx).reverse().toString();
        if(x >= 0) { 
            if(Long.parseLong(revStr) < Integer.MAX_VALUE && Long.parseLong(revStr) > Integer.MIN_VALUE){
                    return Integer.parseInt(revStr);
            } else {
                    return 0;
            }
        } else {
            revStr = revStr.replace("-","");
            if(Long.parseLong(revStr) < Integer.MAX_VALUE && Long.parseLong(revStr) > Integer.MIN_VALUE){
                    return Integer.parseInt("-"+revStr);
            } else {
                    return 0;
            }
        }
    }
}