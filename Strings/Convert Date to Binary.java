class Solution {
    public String convertDateToBinary(String date) {
        String[] a=date.split("-");
        String data=""; 
        for(int i=0;i<a.length;i++){
            int d=Integer.parseInt(a[i]);
            a[i]=Integer.toBinaryString(d);
        }

        return a[0]+"-"+a[1]+"-"+a[2];
    }
}
