class Solution:
    def MedianOfArrays(self, array1, array2):
        array=array1+array2
        array.sort()
        a=len(array)
        if a%2!=0:
            return array[a//2]
        b=array[a//2]+array[(a//2)-1]
        
        result=b/2
        if result.is_integer():
            result = int(result)
        else:
            result = float(result)
        return result
