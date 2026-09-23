class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (String op : operations){
            if (op.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("D")){
                int newTop = 2 * stack.peek();
                stack.push(newTop);
            } else if (op.equals("C")){
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        for (int score : stack){
            result += score;
        }

        return result;
    }
}