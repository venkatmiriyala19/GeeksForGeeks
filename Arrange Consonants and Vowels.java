class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        ArrayList<Character> vowels =new ArrayList<>();
        ArrayList<Character> consonants= new ArrayList<>();
        HashSet<Character> checker= new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Node current=head;
        while (current != null) {
    if (checker.contains(current.data)) {
        vowels.add(current.data);
    } else {
        consonants.add(current.data);
    }
    current = current.next; // Move to the next node
}
current=head;
for(char element:vowels){
    current.data=element;
    current=current.next;
}
for(char element:consonants){
    current.data=element;
    current=current.next;
}
return head;
        
        }
    }
