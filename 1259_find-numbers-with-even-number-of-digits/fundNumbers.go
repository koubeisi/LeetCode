package main

func findNumbers(nums []int) int {
	count := 0
	for _, v := range nums {
		digitCount := 0
		for v > 0 {
			digitCount++
			v = v / 10
		}
		if digitCount%2 == 0 {
			count++
		}
	}
	return count
}

func main() {
	nums := []int{12, 345, 2, 6, 7896}
	result1 := findNumbers(nums)
	nums = []int{555, 901, 482, 1771}
	result2 := findNumbers(nums)
	println(result1, result2)
}
