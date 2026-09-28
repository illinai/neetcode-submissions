class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> cToO = new HashMap<>();

        cToO.put(')', '(');
        cToO.put(']', '[');
        cToO.put('}', '{');

        for (char c : s.toCharArray()) {
            if (cToO.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == cToO.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
