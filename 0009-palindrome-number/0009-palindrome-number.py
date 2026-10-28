class Solution(object):
    def isPalindrome(self, x):
        x=int(input("enter no"))
        for i in len(x):
             if i[:]==i[-1:]:
                return True
class Solution(object):
    def isPalindrome(self, x):
        return str(x) == str(x)[::-1]