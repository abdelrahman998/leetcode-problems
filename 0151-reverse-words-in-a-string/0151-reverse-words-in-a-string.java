class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        int half = arr.length / 2;
        int last = arr.length - 1;
        for (int i = 0; i < half; i++) {
            String temp = arr[i];
            arr[i] = arr[last - i];
            arr[last - i] = temp;
        }
        StringBuilder res = new StringBuilder();
        for(String str : arr) {
            res.append(str).append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();

    }
}