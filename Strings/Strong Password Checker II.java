class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int low = 0, upp = 0, dig = 0, spl = 0, i = 0;
        if (password.length() < 8)
            return false;

        for (i = 0; i < password.length() - 1; i++) {
            char a = password.charAt(i);

            if (a >= 'A' && a <= 'Z')
                upp++;
            else if (a >= 'a' && a <= 'z')
                low++;
            else if (a >= '0' && a <= '9')
                dig++;
            else
                spl++;

            if (password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
        }
        char a=password.charAt(password.length()-1);
        if (a >= 'A' && a <= 'Z')
            upp++;
        else if (a >= 'a' && a <= 'z')
            low++;
        else if (a >= '0' && a <= '9')
            dig++;
        else
            spl++;
        
        if(upp>=1 && low>=1 && dig>=1 && spl>=1){
            return true;
        }
        return false;
    }
}
