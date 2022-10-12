class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list1 = Arrays.asList(s1.split(" "));
        List<String> list2 = Arrays.asList(s2.split(" "));
        List<String> uncommon = new ArrayList();
        
        for(String s : list1){
            if(!list2.contains(s) && list1.indexOf(s) == list1.lastIndexOf(s))uncommon.add(s);
        }
        for(String s : list2){
            if(!list1.contains(s) && list2.indexOf(s) == list2.lastIndexOf(s))uncommon.add(s);
        }
        
        String[] str = new String[uncommon.size()];
        str = uncommon.toArray(str);
        return str;
    }
}