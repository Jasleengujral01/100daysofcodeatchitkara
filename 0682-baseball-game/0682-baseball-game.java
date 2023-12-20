import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        
        for (String op : operations) {
            if (op.equals("+")) {
                int last = st.pop();
                int first = st.peek();
                st.push(last);
                st.push(last + first);
            } else if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                st.push(2 * st.peek());
            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int i : st) {
            sum += i;
        }

        return sum;
    }
}
