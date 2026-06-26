class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int l=0,max=0;
        for(int i=0;i<f.length;i++){
            a.put(f[i],a.getOrDefault(f[i],0)+1);
            while(a.size()>2){
                a.put(f[l],a.get(f[l])-1);
                if(a.get(f[l])==0)a.remove(f[l]);
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
