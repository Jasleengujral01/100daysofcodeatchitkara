class Solution {
public:
    int subtractProductAndSum(int n) {
        int prod = 1;  //initialise product by 1
        int sum = 0;   //initialise sum by 0
        while(n!=0 ){  //while loop till n becomes 0 and if n = 0 then we come out of the loop 
            int digit = n%10;   //for finding last digit 
            prod = prod * digit;
            sum = sum + digit;
            n = n/10;   //for removing every last digit and updating
        }
        int ans = prod - sum;   //final answer or required answer 
        return ans;
    }
};