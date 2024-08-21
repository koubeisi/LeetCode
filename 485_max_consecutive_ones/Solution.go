
package main

func findMaxConsecutiveOnes(nums []int) int {
    var maxConsecutiveResult = 0;
	var maxConsecutiveNow = 0;
	for i := 0; i < len(nums); i++ {
		if (nums[i] == 1) {
			maxConsecutiveNow++;
		} else {
			if maxConsecutiveNow > maxConsecutiveResult {
				maxConsecutiveResult = maxConsecutiveNow;
			}
			maxConsecutiveNow = 0;
		}
	}

	if maxConsecutiveNow >= maxConsecutiveResult {
		return maxConsecutiveNow;
	} 
	return maxConsecutiveResult;
}


func main() {
	var nums = []int{1, 1, 0, 1, 1, 1}
	var result = findMaxConsecutiveOnes(nums)
	println(result)
}
