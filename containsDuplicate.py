class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        numberset= set(nums)
        if len(numberset) == len(nums):
            return False
        else:
            return True

