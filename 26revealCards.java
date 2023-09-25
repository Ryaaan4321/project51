class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int []a=new int[deck.length];
        Queue<Integer> q=new LinkedList<>();
        Arrays.sort(deck);

        for(int i=0;i<deck.length;i++){
            q.add(i);
        }
        for(int i=0;i<deck.length;i++){
            a[q.poll()]=deck[i];
            q.add(q.poll());
        }
        return a;

        
    }
}
