package main

import "fmt"

func merge(nums1 []int, m int, nums2 []int, n int) {
	for i := m + n - 1; i >= 0; i-- {
		if n != 0 && m != 0 {
			if nums1[m-1] > nums2[n-1] {
				nums1[i] = nums1[m-1]
				m--
			} else {
				nums1[i] = nums2[n-1]
				n--
			}
		} else if n != 0 {
			nums1[i] = nums2[n-1]
			n--
		}
	}
}

func main() {
	num1 := []int{1, 2, 3, 0, 0, 0}
	num2 := []int{2, 5, 6}
	merge(num1, 3, num2, 3)
	fmt.Println(num1)
}
