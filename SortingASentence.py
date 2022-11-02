class Solution:
    def sortSentence(self, s: str) -> str:
        arr=s.split() #Split sentence into words
        arr.sort(key=lambda x: int (x[-1]))
        return " ".join(x[:-1] for x in arr) #Join all the elements back into a sentence leaving out last character of each element i.e. the number
