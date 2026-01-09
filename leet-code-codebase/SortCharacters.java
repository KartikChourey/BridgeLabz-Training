451. Sort Characters By Frequency

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()) freq.put(ch,freq.getOrDefault(ch,0)+1);
        PriorityQueue<Character> pq= new PriorityQueue<>((a,b) -> freq.get(b)-freq.get(a));
        pq.addAll(freq.keySet());
        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int count= freq.get(ch);
            while(count-->0) ans.append(ch);
        }
        return ans.toString();

    }
}
