package main

import "fmt"

func duplicateZeros(arr []int) {
	newArr := make([]int, len(arr))
	for i, j := 0, 0; i < len(arr); i, j = i+1, j+1 {
		newArr[i] = arr[j]
		if arr[j] == 0 && i < len(arr)-1 {
			i++
			newArr[i] = 0
		}
	}
	copy(arr, newArr)
}

func main() {
	arr := []int{1, 0, 2, 3, 0, 4, 5, 0}
	duplicateZeros(arr)
	fmt.Println(arr)
}
