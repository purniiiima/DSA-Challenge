class Day3 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<List<String>> result = new ArrayList<>();
        for(String words: strs){
            char[] charArray = words.toCharArray();
            Arrays.sort(charArray);
            String sortedword = String.valueOf(charArray);
            if(!map.containsKey(sortedword)){
                map.put(sortedword, new ArrayList<>());

            }
            map.get(sortedword).add(words);
        }
        result.addAll(map.values());
        return result;
    }
}