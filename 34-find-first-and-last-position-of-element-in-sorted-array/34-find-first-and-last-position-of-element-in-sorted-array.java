class Solution {
    
  public int[] searchRange(int[] nums, int target) {
	int[] result = {-1, -1};
	result[0] = searchIndex(nums, target, true);
	if (result[0] != -1) {
		result[1] = searchIndex(nums, target, false);
	}
	return result;
}

private int searchIndex(int[] nums, int target, boolean startIndex) {
	int low = 0, high = nums.length - 1;
	int index = -1;
	while (low <= high) {
		int mid = low + (high - low) / 2;
		if (target < nums[mid]) {
			high = mid - 1;
		} else if (target > nums[mid]) {
			low = mid + 1;
		} else {
			index = mid;
			if (startIndex) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
	}
	return index;
}
}