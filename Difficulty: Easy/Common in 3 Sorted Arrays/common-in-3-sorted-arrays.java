// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> res=new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
    int val1 = arr1.get(i);
    int val2 = arr2.get(j);
    int val3 = arr3.get(k);

    if (val1 == val2 && val2 == val3) {
        if (res.isEmpty() || res.get(res.size() - 1) != val1) {
                    res.add(val1);
                }
        i++;
        j++;
        k++;
    } else if (val1 < val2 || val1 < val3) {
        i++;
    } else if (val2 < val3) {
        j++;
    } else {
        k++;}
        }
        return res;
    }
}