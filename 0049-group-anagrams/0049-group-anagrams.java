class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String,List<String>>();
        List<List<String>> list = new ArrayList<>();
        for(String s : strs){
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            map.computeIfAbsent(String.valueOf(chArr), k -> new ArrayList<>()).add(s);
        }
        list.addAll(map.values());
        return list;
    }
}